// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ChangeUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeUserPasswordResponseBody body;

    public static ChangeUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeUserPasswordResponse self = new ChangeUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ChangeUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeUserPasswordResponse setBody(ChangeUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeUserPasswordResponseBody getBody() {
        return this.body;
    }

}
