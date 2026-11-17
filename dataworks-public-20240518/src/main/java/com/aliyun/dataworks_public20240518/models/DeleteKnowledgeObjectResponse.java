// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKnowledgeObjectResponseBody body;

    public static DeleteKnowledgeObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeObjectResponse self = new DeleteKnowledgeObjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKnowledgeObjectResponse setBody(DeleteKnowledgeObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeObjectResponseBody getBody() {
        return this.body;
    }

}
