// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicIpSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the region where the basic GA instance is deployed.</p>
     */
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth of the acceleration region of the basic GA instance. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The accelerated IP address.</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The ID of the acceleration region of the basic GA instance.</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The Internet protocol version. Only **IPv4** may be returned.</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) lines.</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines.</p>
     * <br>
     * <p>Valid values if you are allowed to use single-ISP bandwidth:</p>
     * <br>
     * <p>*   **ChinaTelecom**</p>
     * <p>*   **ChinaUnicom**</p>
     * <p>*   **ChinaMobile**</p>
     * <p>*   **ChinaTelecom_L2**</p>
     * <p>*   **ChinaUnicom_L2**</p>
     * <p>*   **ChinaMobile_L2**</p>
     */
    @NameInMap("IspType")
    public String ispType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the acceleration region of the basic GA instance. Valid values:</p>
     * <br>
     * <p>*   **init**: The acceleration region is being initialized.</p>
     * <p>*   **active**: The acceleration region is in the running state.</p>
     * <p>*   **updating**: The acceleration region is being configured.</p>
     * <p>*   **Deleting**: The acceleration region is being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    public static GetBasicIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicIpSetResponseBody self = new GetBasicIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicIpSetResponseBody setAccelerateRegionId(String accelerateRegionId) {
        this.accelerateRegionId = accelerateRegionId;
        return this;
    }
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    public GetBasicIpSetResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicIpSetResponseBody setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public GetBasicIpSetResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public GetBasicIpSetResponseBody setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public GetBasicIpSetResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public GetBasicIpSetResponseBody setIspType(String ispType) {
        this.ispType = ispType;
        return this;
    }
    public String getIspType() {
        return this.ispType;
    }

    public GetBasicIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicIpSetResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
