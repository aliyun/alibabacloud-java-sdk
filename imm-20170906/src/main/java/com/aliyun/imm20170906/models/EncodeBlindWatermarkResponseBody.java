// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class EncodeBlindWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TargetUri")
    public String targetUri;

    @NameInMap("Content")
    public String content;

    public static EncodeBlindWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EncodeBlindWatermarkResponseBody self = new EncodeBlindWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public EncodeBlindWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EncodeBlindWatermarkResponseBody setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

    public EncodeBlindWatermarkResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
