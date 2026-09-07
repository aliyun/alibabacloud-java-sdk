// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKnowledgeFileResponseBody body;

    public static DeleteKnowledgeFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeFileResponse self = new DeleteKnowledgeFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKnowledgeFileResponse setBody(DeleteKnowledgeFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeFileResponseBody getBody() {
        return this.body;
    }

}
