// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeSourceResponseBody body;

    public static CreateKnowledgeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeSourceResponse self = new CreateKnowledgeSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeSourceResponse setBody(CreateKnowledgeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeSourceResponseBody getBody() {
        return this.body;
    }

}
