// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CheckSwitchPostUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSwitchPostUserResponseBody body;

    public static CheckSwitchPostUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSwitchPostUserResponse self = new CheckSwitchPostUserResponse();
        return TeaModel.build(map, self);
    }

    public CheckSwitchPostUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSwitchPostUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSwitchPostUserResponse setBody(CheckSwitchPostUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSwitchPostUserResponseBody getBody() {
        return this.body;
    }

}
