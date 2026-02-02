// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyPROResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EntElementVerifyPROResponseBody body;

    public static EntElementVerifyPROResponse build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyPROResponse self = new EntElementVerifyPROResponse();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyPROResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntElementVerifyPROResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntElementVerifyPROResponse setBody(EntElementVerifyPROResponseBody body) {
        this.body = body;
        return this;
    }
    public EntElementVerifyPROResponseBody getBody() {
        return this.body;
    }

}
