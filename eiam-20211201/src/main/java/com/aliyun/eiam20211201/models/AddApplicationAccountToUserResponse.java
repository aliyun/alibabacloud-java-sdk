// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddApplicationAccountToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddApplicationAccountToUserResponseBody body;

    public static AddApplicationAccountToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddApplicationAccountToUserResponse self = new AddApplicationAccountToUserResponse();
        return TeaModel.build(map, self);
    }

    public AddApplicationAccountToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddApplicationAccountToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddApplicationAccountToUserResponse setBody(AddApplicationAccountToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApplicationAccountToUserResponseBody getBody() {
        return this.body;
    }

}
