// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GenMetaKnowledgeAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenMetaKnowledgeAssetResponseBody body;

    public static GenMetaKnowledgeAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        GenMetaKnowledgeAssetResponse self = new GenMetaKnowledgeAssetResponse();
        return TeaModel.build(map, self);
    }

    public GenMetaKnowledgeAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenMetaKnowledgeAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenMetaKnowledgeAssetResponse setBody(GenMetaKnowledgeAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public GenMetaKnowledgeAssetResponseBody getBody() {
        return this.body;
    }

}
