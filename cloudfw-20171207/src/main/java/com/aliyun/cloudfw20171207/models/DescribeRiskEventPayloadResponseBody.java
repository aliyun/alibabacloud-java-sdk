// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventPayloadResponseBody extends TeaModel {
    /**
     * <p>The destination IP address of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.1</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The destination port of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("DstPort")
    public Integer dstPort;

    /**
     * <p>The destination VPC ID of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp10w5nb30r4jzfyc****</p>
     */
    @NameInMap("DstVpcId")
    public String dstVpcId;

    /**
     * <p>Type of the hit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HitContentType")
    public Integer hitContentType;

    /**
     * <p>The position where the hit ends.</p>
     * 
     * <strong>example:</strong>
     * <p>67</p>
     */
    @NameInMap("HitTo")
    public Integer hitTo;

    /**
     * <p>Hit payload.</p>
     * 
     * <strong>example:</strong>
     * <p>2f636f6d706f7365722f73656e645f656d61696c3f746f3d6d61667740776f66736f7961792675726c3d687474703a2f2f302e302e302e303a31323334352f692f6431366530312f313664622f673670772f</p>
     */
    @NameInMap("ParsedContent")
    public String parsedContent;

    /**
     * <p>The attack payload of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>302902010004067075626c6963a01c0204036a5f43020100020100300e300c06082b060102010101000500</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The length of the attack payload of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>457</p>
     */
    @NameInMap("PayloadLen")
    public Integer payloadLen;

    /**
     * <p>The protocol type of intrusion event. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The HTTP X-Real-IP field.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.3</p>
     */
    @NameInMap("RealIp")
    public String realIp;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68055BA4-D8BD-5611-AC49-C651E619A12E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source IP address of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.2</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The source port of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>54360</p>
     */
    @NameInMap("SrcPort")
    public Integer srcPort;

    /**
     * <p>The source VPC ID of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4nlt09olhpazpoeg****</p>
     */
    @NameInMap("SrcVpcId")
    public String srcVpcId;

    /**
     * <p>The HTTP X-Forwarded-For field.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.4</p>
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

    public DescribeRiskEventPayloadResponseBody setHitContentType(Integer hitContentType) {
        this.hitContentType = hitContentType;
        return this;
    }
    public Integer getHitContentType() {
        return this.hitContentType;
    }

    public DescribeRiskEventPayloadResponseBody setHitTo(Integer hitTo) {
        this.hitTo = hitTo;
        return this;
    }
    public Integer getHitTo() {
        return this.hitTo;
    }

    public DescribeRiskEventPayloadResponseBody setParsedContent(String parsedContent) {
        this.parsedContent = parsedContent;
        return this;
    }
    public String getParsedContent() {
        return this.parsedContent;
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
