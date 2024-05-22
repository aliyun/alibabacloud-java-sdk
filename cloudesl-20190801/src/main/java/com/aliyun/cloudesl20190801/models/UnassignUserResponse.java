// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UnassignUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnassignUserResponseBody body;

    public static UnassignUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignUserResponse self = new UnassignUserResponse();
        return TeaModel.build(map, self);
    }

    public UnassignUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassignUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnassignUserResponse setBody(UnassignUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassignUserResponseBody getBody() {
        return this.body;
    }

}
