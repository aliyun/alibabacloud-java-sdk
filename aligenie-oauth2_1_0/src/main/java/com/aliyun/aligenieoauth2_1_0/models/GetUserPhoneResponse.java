// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetUserPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserPhoneResponseBody body;

    public static GetUserPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPhoneResponse self = new GetUserPhoneResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserPhoneResponse setBody(GetUserPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPhoneResponseBody getBody() {
        return this.body;
    }

}
