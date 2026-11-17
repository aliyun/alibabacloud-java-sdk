// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseBuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseBuildTaskResponseBody body;

    public static CreateKnowledgeBaseBuildTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseBuildTaskResponse self = new CreateKnowledgeBaseBuildTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseBuildTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseBuildTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseBuildTaskResponse setBody(CreateKnowledgeBaseBuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseBuildTaskResponseBody getBody() {
        return this.body;
    }

}
