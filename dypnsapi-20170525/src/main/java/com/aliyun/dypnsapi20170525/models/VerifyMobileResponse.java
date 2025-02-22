// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyMobileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyMobileResponseBody body;

    public static VerifyMobileResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMobileResponse self = new VerifyMobileResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMobileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyMobileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyMobileResponse setBody(VerifyMobileResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyMobileResponseBody getBody() {
        return this.body;
    }

}
