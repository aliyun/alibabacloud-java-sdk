// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateMultiModelKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultiModelKnowledgeBaseResponseBody body;

    public static CreateMultiModelKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiModelKnowledgeBaseResponse self = new CreateMultiModelKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultiModelKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultiModelKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultiModelKnowledgeBaseResponse setBody(CreateMultiModelKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultiModelKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
