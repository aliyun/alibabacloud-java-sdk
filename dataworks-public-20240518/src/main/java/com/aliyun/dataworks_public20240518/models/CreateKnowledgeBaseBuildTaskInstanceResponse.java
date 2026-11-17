// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseBuildTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseBuildTaskInstanceResponseBody body;

    public static CreateKnowledgeBaseBuildTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseBuildTaskInstanceResponse self = new CreateKnowledgeBaseBuildTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponse setBody(CreateKnowledgeBaseBuildTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseBuildTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
