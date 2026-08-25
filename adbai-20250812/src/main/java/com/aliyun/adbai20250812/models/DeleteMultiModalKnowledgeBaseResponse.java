// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DeleteMultiModalKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultiModalKnowledgeBaseResponseBody body;

    public static DeleteMultiModalKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiModalKnowledgeBaseResponse self = new DeleteMultiModalKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultiModalKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultiModalKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultiModalKnowledgeBaseResponse setBody(DeleteMultiModalKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultiModalKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
