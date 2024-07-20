// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicIpSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the region where the basic GA instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    /**
     * <p>The ID of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth of the acceleration region of the basic GA instance. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The accelerated IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>118.31.XX.XX</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The ID of the acceleration region of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ips-bp11ilwqjdkjeg9r7****</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The Internet protocol version. Only <strong>IPv4</strong> may be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (Multi-ISP) lines.</li>
     * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines.</li>
     * </ul>
     * <p>Valid values if you are allowed to use single-ISP bandwidth:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong></li>
     * <li><strong>ChinaUnicom</strong></li>
     * <li><strong>ChinaMobile</strong></li>
     * <li><strong>ChinaTelecom_L2</strong></li>
     * <li><strong>ChinaUnicom_L2</strong></li>
     * <li><strong>ChinaMobile_L2</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("IspType")
    public String ispType;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6D2BFF54-6AF2-4679-88C4-2F2E187F16CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the acceleration region of the basic GA instance. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The acceleration region is being initialized.</li>
     * <li><strong>active</strong>: The acceleration region is in the running state.</li>
     * <li><strong>updating</strong>: The acceleration region is being configured.</li>
     * <li><strong>Deleting</strong>: The acceleration region is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
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
