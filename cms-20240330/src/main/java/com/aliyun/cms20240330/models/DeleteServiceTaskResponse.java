// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteServiceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceTaskResponseBody body;

    public static DeleteServiceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTaskResponse self = new DeleteServiceTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceTaskResponse setBody(DeleteServiceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceTaskResponseBody getBody() {
        return this.body;
    }

}
