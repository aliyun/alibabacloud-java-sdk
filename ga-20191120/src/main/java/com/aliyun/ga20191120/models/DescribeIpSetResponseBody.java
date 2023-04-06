// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeIpSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the acceleration region.</p>
     */
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth that is allocated to the acceleration region. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The list of accelerated IP addresses in the acceleration region.</p>
     */
    @NameInMap("IpAddressList")
    public java.util.List<String> ipAddressList;

    /**
     * <p>The ID of the acceleration region.</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The version of the IP protocol. Valid values:</p>
     * <br>
     * <p>*   **IPv4**</p>
     * <p>*   **IPv6**</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The line type of the elastic IP address (EIP) in the acceleration region.</p>
     * <br>
     * <p>*   **BGP**: BGP (Multi-ISP) lines.</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines</p>
     * <br>
     * <p>If you are allowed to use single-ISP bandwidth, one of the following values is returned:</p>
     * <br>
     * <p>*   **ChinaTelecom**: China Telecom (single ISP).</p>
     * <p>*   **ChinaUnicom**: China Unicom (single ISP).</p>
     * <p>*   **ChinaMobile**: China Mobile (single ISP).</p>
     * <p>*   **ChinaTelecom_L2**: China Telecom (single ISP)\_L2.</p>
     * <p>*   **ChinaUnicom_L2**: China Unicom (single ISP)\_L2.</p>
     * <p>*   **ChinaMobile_L2**: China Mobile (single ISP)\_L2.</p>
     * <br>
     * <p>>  The supported single-ISP line types vary based on the acceleration region.</p>
     */
    @NameInMap("IspType")
    public String ispType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the acceleration region. Valid values:</p>
     * <br>
     * <p>*   **init**: The acceleration region is being initialized.</p>
     * <p>*   **active**: The acceleration region is in the running state.</p>
     * <p>*   **updating**: The acceleration region is being configured.</p>
     * <p>*   **deleting:** The VPN gateway is being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpSetResponseBody self = new DescribeIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpSetResponseBody setAccelerateRegionId(String accelerateRegionId) {
        this.accelerateRegionId = accelerateRegionId;
        return this;
    }
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    public DescribeIpSetResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeIpSetResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeIpSetResponseBody setIpAddressList(java.util.List<String> ipAddressList) {
        this.ipAddressList = ipAddressList;
        return this;
    }
    public java.util.List<String> getIpAddressList() {
        return this.ipAddressList;
    }

    public DescribeIpSetResponseBody setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public DescribeIpSetResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeIpSetResponseBody setIspType(String ispType) {
        this.ispType = ispType;
        return this;
    }
    public String getIspType() {
        return this.ispType;
    }

    public DescribeIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpSetResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
