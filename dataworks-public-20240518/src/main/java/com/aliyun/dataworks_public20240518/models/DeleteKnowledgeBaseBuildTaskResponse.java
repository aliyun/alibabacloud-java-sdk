// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseBuildTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKnowledgeBaseBuildTaskResponseBody body;

    public static DeleteKnowledgeBaseBuildTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseBuildTaskResponse self = new DeleteKnowledgeBaseBuildTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseBuildTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeBaseBuildTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKnowledgeBaseBuildTaskResponse setBody(DeleteKnowledgeBaseBuildTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeBaseBuildTaskResponseBody getBody() {
        return this.body;
    }

}
