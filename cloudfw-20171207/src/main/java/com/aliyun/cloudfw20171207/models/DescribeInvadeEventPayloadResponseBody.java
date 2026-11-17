// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventPayloadResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the asset to which the event belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6faknmuby7ezht****</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <p>The UUID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>fadd-dfdd-****</p>
     */
    @NameInMap("EventUuid")
    public String eventUuid;

    /**
     * <p>The end position (character index) of the matched content in the payload.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HighlightEnd")
    public Integer highlightEnd;

    /**
     * <p>The start position (character index) of the matched content in the payload.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HighlightStart")
    public Integer highlightStart;

    /**
     * <p>The original packet payload of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>302902010004067075626c6963a01c0204036a5f43020100020100300e300c06082b060102010101000500</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The length of the payload in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>457</p>
     */
    @NameInMap("PayloadLen")
    public Integer payloadLen;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B14757D0-4640-4B44-AC67-7F558FE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvadeEventPayloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventPayloadResponseBody self = new DescribeInvadeEventPayloadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventPayloadResponseBody setAssetsInstanceId(String assetsInstanceId) {
        this.assetsInstanceId = assetsInstanceId;
        return this;
    }
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    public DescribeInvadeEventPayloadResponseBody setEventUuid(String eventUuid) {
        this.eventUuid = eventUuid;
        return this;
    }
    public String getEventUuid() {
        return this.eventUuid;
    }

    public DescribeInvadeEventPayloadResponseBody setHighlightEnd(Integer highlightEnd) {
        this.highlightEnd = highlightEnd;
        return this;
    }
    public Integer getHighlightEnd() {
        return this.highlightEnd;
    }

    public DescribeInvadeEventPayloadResponseBody setHighlightStart(Integer highlightStart) {
        this.highlightStart = highlightStart;
        return this;
    }
    public Integer getHighlightStart() {
        return this.highlightStart;
    }

    public DescribeInvadeEventPayloadResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public DescribeInvadeEventPayloadResponseBody setPayloadLen(Integer payloadLen) {
        this.payloadLen = payloadLen;
        return this;
    }
    public Integer getPayloadLen() {
        return this.payloadLen;
    }

    public DescribeInvadeEventPayloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
