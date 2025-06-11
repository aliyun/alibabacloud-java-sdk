// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditMetaKnowledgeAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditMetaKnowledgeAssetResponseBody body;

    public static EditMetaKnowledgeAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        EditMetaKnowledgeAssetResponse self = new EditMetaKnowledgeAssetResponse();
        return TeaModel.build(map, self);
    }

    public EditMetaKnowledgeAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditMetaKnowledgeAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditMetaKnowledgeAssetResponse setBody(EditMetaKnowledgeAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public EditMetaKnowledgeAssetResponseBody getBody() {
        return this.body;
    }

}
