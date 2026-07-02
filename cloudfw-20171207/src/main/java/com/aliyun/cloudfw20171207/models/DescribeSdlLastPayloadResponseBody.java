// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlLastPayloadResponseBody extends TeaModel {
    /**
     * <p>The destination port.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DstPortList")
    public String dstPortList;

    /**
     * <p>The attack payload of the intrusion prevention event.</p>
     * 
     * <strong>example:</strong>
     * <p>302902010004067075626c6963a01c0204036a5f43020100020100300e300c06082b060102010101000500</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("ProtoList")
    public String protoList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source port.</p>
     * 
     * <strong>example:</strong>
     * <p>1586</p>
     */
    @NameInMap("SrcPortList")
    public String srcPortList;

    public static DescribeSdlLastPayloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlLastPayloadResponseBody self = new DescribeSdlLastPayloadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSdlLastPayloadResponseBody setDstPortList(String dstPortList) {
        this.dstPortList = dstPortList;
        return this;
    }
    public String getDstPortList() {
        return this.dstPortList;
    }

    public DescribeSdlLastPayloadResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public DescribeSdlLastPayloadResponseBody setProtoList(String protoList) {
        this.protoList = protoList;
        return this;
    }
    public String getProtoList() {
        return this.protoList;
    }

    public DescribeSdlLastPayloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSdlLastPayloadResponseBody setSrcPortList(String srcPortList) {
        this.srcPortList = srcPortList;
        return this;
    }
    public String getSrcPortList() {
        return this.srcPortList;
    }

}
