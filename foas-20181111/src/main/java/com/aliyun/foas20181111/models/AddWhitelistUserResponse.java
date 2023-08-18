// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class AddWhitelistUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddWhitelistUserResponseBody body;

    public static AddWhitelistUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWhitelistUserResponse self = new AddWhitelistUserResponse();
        return TeaModel.build(map, self);
    }

    public AddWhitelistUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWhitelistUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWhitelistUserResponse setBody(AddWhitelistUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWhitelistUserResponseBody getBody() {
        return this.body;
    }

}
