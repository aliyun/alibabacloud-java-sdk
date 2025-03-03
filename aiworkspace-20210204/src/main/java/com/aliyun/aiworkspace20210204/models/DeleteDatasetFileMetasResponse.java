// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetFileMetasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasetFileMetasResponseBody body;

    public static DeleteDatasetFileMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetFileMetasResponse self = new DeleteDatasetFileMetasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetFileMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetFileMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasetFileMetasResponse setBody(DeleteDatasetFileMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetFileMetasResponseBody getBody() {
        return this.body;
    }

}
