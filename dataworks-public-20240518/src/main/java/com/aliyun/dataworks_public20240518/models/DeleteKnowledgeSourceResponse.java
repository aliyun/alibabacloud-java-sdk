// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKnowledgeSourceResponseBody body;

    public static DeleteKnowledgeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeSourceResponse self = new DeleteKnowledgeSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKnowledgeSourceResponse setBody(DeleteKnowledgeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeSourceResponseBody getBody() {
        return this.body;
    }

}
