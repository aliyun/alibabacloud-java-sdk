// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SignalCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SignalCallResponseBody body;

    public static SignalCallResponse build(java.util.Map<String, ?> map) throws Exception {
        SignalCallResponse self = new SignalCallResponse();
        return TeaModel.build(map, self);
    }

    public SignalCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignalCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignalCallResponse setBody(SignalCallResponseBody body) {
        this.body = body;
        return this;
    }
    public SignalCallResponseBody getBody() {
        return this.body;
    }

}
