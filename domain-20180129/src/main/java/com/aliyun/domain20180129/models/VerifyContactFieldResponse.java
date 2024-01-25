// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class VerifyContactFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyContactFieldResponseBody body;

    public static VerifyContactFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyContactFieldResponse self = new VerifyContactFieldResponse();
        return TeaModel.build(map, self);
    }

    public VerifyContactFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyContactFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyContactFieldResponse setBody(VerifyContactFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyContactFieldResponseBody getBody() {
        return this.body;
    }

}
