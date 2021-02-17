// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DecodeBlindWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    @NameInMap("TargetUri")
    public String targetUri;

    public static DecodeBlindWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecodeBlindWatermarkResponseBody self = new DecodeBlindWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public DecodeBlindWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DecodeBlindWatermarkResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DecodeBlindWatermarkResponseBody setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

}
