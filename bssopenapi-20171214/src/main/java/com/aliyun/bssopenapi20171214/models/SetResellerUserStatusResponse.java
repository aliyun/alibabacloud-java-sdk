// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetResellerUserStatusResponseBody body;

    public static SetResellerUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserStatusResponse self = new SetResellerUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetResellerUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetResellerUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetResellerUserStatusResponse setBody(SetResellerUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetResellerUserStatusResponseBody getBody() {
        return this.body;
    }

}
