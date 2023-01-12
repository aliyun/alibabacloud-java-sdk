// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsRequest extends TeaModel {
    @NameInMap("AccelerateRegion")
    public java.util.List<CreateIpSetsRequestAccelerateRegion> accelerateRegion;

    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
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
         * <p>The ID of the region that requires acceleration.</p>
         * <br>
         * <p>The number of regions that can be added varies based on the specification of the GA instance. For more information, see [Overview](~~153127~~).</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The bandwidth to be allocated to the acceleration region. Unit: **Mbit/s**.</p>
         * <br>
         * <p>> </p>
         * <p>*   Each acceleration region must be allocated a minimum of 2 Mbit/s of bandwidth.</p>
         * <p>*   The total bandwidth for all acceleration regions cannot exceed the bandwidth limit of your basic bandwidth plan.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The IP version used to connect to the GA instance. Valid values:</p>
         * <br>
         * <p>*   **IPv4** (default): IPv4</p>
         * <p>*   **IPv6**: IPv6</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

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
