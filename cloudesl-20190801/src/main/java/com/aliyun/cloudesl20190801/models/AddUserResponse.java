// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class AddUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserResponseBody body;

    public static AddUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserResponse self = new AddUserResponse();
        return TeaModel.build(map, self);
    }

    public AddUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserResponse setBody(AddUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserResponseBody getBody() {
        return this.body;
    }

}
