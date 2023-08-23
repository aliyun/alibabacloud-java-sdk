// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventPayloadRequest extends TeaModel {
    @NameInMap("DstIP")
    public String dstIP;

    @NameInMap("DstVpcId")
    public String dstVpcId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FirewallType")
    public String firewallType;

    @NameInMap("PublicIP")
    public String publicIP;

    @NameInMap("SrcIP")
    public String srcIP;

    @NameInMap("SrcVpcId")
    public String srcVpcId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UUID")
    public String UUID;

    public static DescribeRiskEventPayloadRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventPayloadRequest self = new DescribeRiskEventPayloadRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventPayloadRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeRiskEventPayloadRequest setDstVpcId(String dstVpcId) {
        this.dstVpcId = dstVpcId;
        return this;
    }
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    public DescribeRiskEventPayloadRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventPayloadRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeRiskEventPayloadRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeRiskEventPayloadRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeRiskEventPayloadRequest setSrcVpcId(String srcVpcId) {
        this.srcVpcId = srcVpcId;
        return this;
    }
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    public DescribeRiskEventPayloadRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRiskEventPayloadRequest setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

}
