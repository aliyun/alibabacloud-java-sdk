// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindVerificationResponseBody body;

    public static UnbindVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindVerificationResponse self = new UnbindVerificationResponse();
        return TeaModel.build(map, self);
    }

    public UnbindVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindVerificationResponse setBody(UnbindVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindVerificationResponseBody getBody() {
        return this.body;
    }

}
