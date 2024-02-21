// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteComponentIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComponentIndexResponseBody body;

    public static DeleteComponentIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentIndexResponse self = new DeleteComponentIndexResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComponentIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComponentIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComponentIndexResponse setBody(DeleteComponentIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComponentIndexResponseBody getBody() {
        return this.body;
    }

}
