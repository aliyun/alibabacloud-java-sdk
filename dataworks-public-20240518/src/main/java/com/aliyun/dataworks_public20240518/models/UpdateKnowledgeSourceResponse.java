// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeSourceResponseBody body;

    public static UpdateKnowledgeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeSourceResponse self = new UpdateKnowledgeSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeSourceResponse setBody(UpdateKnowledgeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeSourceResponseBody getBody() {
        return this.body;
    }

}
