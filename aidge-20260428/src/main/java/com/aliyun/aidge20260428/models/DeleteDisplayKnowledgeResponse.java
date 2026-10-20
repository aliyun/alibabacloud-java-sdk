// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DeleteDisplayKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDisplayKnowledgeResponseBody body;

    public static DeleteDisplayKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDisplayKnowledgeResponse self = new DeleteDisplayKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDisplayKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDisplayKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDisplayKnowledgeResponse setBody(DeleteDisplayKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDisplayKnowledgeResponseBody getBody() {
        return this.body;
    }

}
