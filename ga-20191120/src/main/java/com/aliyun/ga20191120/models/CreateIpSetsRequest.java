// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsRequest extends TeaModel {
    /**
     * <p>The information about the acceleration regions.</p>
     */
    @NameInMap("AccelerateRegion")
    public java.util.List<CreateIpSetsRequestAccelerateRegion> accelerateRegion;

    /**
     * <p>The GA instance ID.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateIpSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSetsRequest self = new CreateIpSetsRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpSetsRequest setAccelerateRegion(java.util.List<CreateIpSetsRequestAccelerateRegion> accelerateRegion) {
        this.accelerateRegion = accelerateRegion;
        return this;
    }
    public java.util.List<CreateIpSetsRequestAccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    public CreateIpSetsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateIpSetsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateIpSetsRequestAccelerateRegion extends TeaModel {
        /**
         * <p>The ID of the acceleration region.</p>
         * <br>
         * <p>The number of regions that you can add varies based on the specification of the GA instance. For more information, see [Overview](~~153127~~).</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The bandwidth that you want to allocate to the acceleration region. Unit: **Mbit/s**.</p>
         * <br>
         * <p>>*  This parameter is required.</p>
         * <p>>*   You must allocate at least 2 Mbit/s of bandwidth to each acceleration region.</p>
         * <p>>*   The total bandwidth of all acceleration regions cannot exceed the bandwidth limit of your basic bandwidth plan.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The IP version used to connect to the GA instance. Valid values:</p>
         * <br>
         * <p>*   **IPv4** (default)</p>
         * <p>*   **IPv6**</p>
         * <p>*   **DUAL_STACK**: IPv4 and IPv6</p>
         * <br>
         * <p>> Only pay-as-you-go standard GA instances support DUAL_STACK.</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP) lines.</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines</p>
         * <br>
         * <p>> *   This parameter is required only if the bandwidth metering method of the GA instance is **pay-by-data transfer**.</p>
         * <p>>*   Different acceleration regions support different line types of EIPs.</p>
         */
        @NameInMap("IspType")
        public String ispType;

        public static CreateIpSetsRequestAccelerateRegion build(java.util.Map<String, ?> map) throws Exception {
            CreateIpSetsRequestAccelerateRegion self = new CreateIpSetsRequestAccelerateRegion();
            return TeaModel.build(map, self);
        }

        public CreateIpSetsRequestAccelerateRegion setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public CreateIpSetsRequestAccelerateRegion setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CreateIpSetsRequestAccelerateRegion setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public CreateIpSetsRequestAccelerateRegion setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

    }

}
