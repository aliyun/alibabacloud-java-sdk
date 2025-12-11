// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSourceResponseBody body;

    public static DeleteSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceResponse self = new DeleteSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSourceResponse setBody(DeleteSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSourceResponseBody getBody() {
        return this.body;
    }

}
