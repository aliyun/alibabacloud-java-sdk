// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDataTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataTaskResponseBody body;

    public static DeleteDataTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataTaskResponse self = new DeleteDataTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataTaskResponse setBody(DeleteDataTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataTaskResponseBody getBody() {
        return this.body;
    }

}
