// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeIpSetResponseBody extends TeaModel {
    @NameInMap("IpSetId")
    public String ipSetId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("State")
    public String state;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("IpAddressList")
    public java.util.List<String> ipAddressList;

    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    public static DescribeIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpSetResponseBody self = new DescribeIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpSetResponseBody setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public DescribeIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpSetResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeIpSetResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
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

}
