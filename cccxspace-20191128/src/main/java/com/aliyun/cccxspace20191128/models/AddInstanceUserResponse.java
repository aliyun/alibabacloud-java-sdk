// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class AddInstanceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddInstanceUserResponseBody body;

    public static AddInstanceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceUserResponse self = new AddInstanceUserResponse();
        return TeaModel.build(map, self);
    }

    public AddInstanceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInstanceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInstanceUserResponse setBody(AddInstanceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInstanceUserResponseBody getBody() {
        return this.body;
    }

}
