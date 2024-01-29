// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteServiceSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceSourceResponseBody body;

    public static DeleteServiceSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceSourceResponse self = new DeleteServiceSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceSourceResponse setBody(DeleteServiceSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceSourceResponseBody getBody() {
        return this.body;
    }

}
