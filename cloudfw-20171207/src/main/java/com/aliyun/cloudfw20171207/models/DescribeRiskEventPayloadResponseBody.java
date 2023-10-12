// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventPayloadResponseBody extends TeaModel {
    /**
     * <p>The destination IP address of the intrusion event.</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The destination port of the intrusion event.</p>
     */
    @NameInMap("DstPort")
    public Integer dstPort;

    /**
     * <p>The destination VPC ID of the intrusion event.</p>
     */
    @NameInMap("DstVpcId")
    public String dstVpcId;

    /**
     * <p>The attack payload of the intrusion event.</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The length of the attack payload of the intrusion event.</p>
     */
    @NameInMap("PayloadLen")
    public Integer payloadLen;

    /**
     * <p>The protocol type of intrusion event. Valid values:</p>
     * <br>
     * <p>*   **TCP**</p>
     * <p>*   **UDP**</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The HTTP X-Real-IP field.</p>
     */
    @NameInMap("RealIp")
    public String realIp;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source IP address of the intrusion event.</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The source port of the intrusion event.</p>
     */
    @NameInMap("SrcPort")
    public Integer srcPort;

    /**
     * <p>The source VPC ID of the intrusion event.</p>
     */
    @NameInMap("SrcVpcId")
    public String srcVpcId;

    /**
     * <p>The HTTP X-Forwarded-For field.</p>
     */
    @NameInMap("XForwardFor")
    public String XForwardFor;

    public static DescribeRiskEventPayloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventPayloadResponseBody self = new DescribeRiskEventPayloadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventPayloadResponseBody setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeRiskEventPayloadResponseBody setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public DescribeRiskEventPayloadResponseBody setDstVpcId(String dstVpcId) {
        this.dstVpcId = dstVpcId;
        return this;
    }
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    public DescribeRiskEventPayloadResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public DescribeRiskEventPayloadResponseBody setPayloadLen(Integer payloadLen) {
        this.payloadLen = payloadLen;
        return this;
    }
    public Integer getPayloadLen() {
        return this.payloadLen;
    }

    public DescribeRiskEventPayloadResponseBody setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeRiskEventPayloadResponseBody setRealIp(String realIp) {
        this.realIp = realIp;
        return this;
    }
    public String getRealIp() {
        return this.realIp;
    }

    public DescribeRiskEventPayloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskEventPayloadResponseBody setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeRiskEventPayloadResponseBody setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }
    public Integer getSrcPort() {
        return this.srcPort;
    }

    public DescribeRiskEventPayloadResponseBody setSrcVpcId(String srcVpcId) {
        this.srcVpcId = srcVpcId;
        return this;
    }
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    public DescribeRiskEventPayloadResponseBody setXForwardFor(String XForwardFor) {
        this.XForwardFor = XForwardFor;
        return this;
    }
    public String getXForwardFor() {
        return this.XForwardFor;
    }

}
