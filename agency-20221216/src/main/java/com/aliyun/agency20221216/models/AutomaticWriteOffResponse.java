// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class AutomaticWriteOffResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AutomaticWriteOffResponseBody body;

    public static AutomaticWriteOffResponse build(java.util.Map<String, ?> map) throws Exception {
        AutomaticWriteOffResponse self = new AutomaticWriteOffResponse();
        return TeaModel.build(map, self);
    }

    public AutomaticWriteOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AutomaticWriteOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AutomaticWriteOffResponse setBody(AutomaticWriteOffResponseBody body) {
        this.body = body;
        return this;
    }
    public AutomaticWriteOffResponseBody getBody() {
        return this.body;
    }

}
