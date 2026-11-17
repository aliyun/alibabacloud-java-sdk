// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeObjectUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeObjectUploadResponseBody body;

    public static CreateKnowledgeObjectUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeObjectUploadResponse self = new CreateKnowledgeObjectUploadResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeObjectUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeObjectUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeObjectUploadResponse setBody(CreateKnowledgeObjectUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeObjectUploadResponseBody getBody() {
        return this.body;
    }

}
