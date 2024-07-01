// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckBindRamUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckBindRamUserResponseBody body;

    public static CheckBindRamUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBindRamUserResponse self = new CheckBindRamUserResponse();
        return TeaModel.build(map, self);
    }

    public CheckBindRamUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBindRamUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBindRamUserResponse setBody(CheckBindRamUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBindRamUserResponseBody getBody() {
        return this.body;
    }

}
