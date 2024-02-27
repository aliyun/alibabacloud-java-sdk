// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccountInfoResponseBody body;

    public static SetAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccountInfoResponse self = new SetAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccountInfoResponse setBody(SetAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccountInfoResponseBody getBody() {
        return this.body;
    }

}
