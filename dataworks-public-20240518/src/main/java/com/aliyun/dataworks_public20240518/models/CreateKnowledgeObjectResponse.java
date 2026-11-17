// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeObjectResponseBody body;

    public static CreateKnowledgeObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeObjectResponse self = new CreateKnowledgeObjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeObjectResponse setBody(CreateKnowledgeObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeObjectResponseBody getBody() {
        return this.body;
    }

}
