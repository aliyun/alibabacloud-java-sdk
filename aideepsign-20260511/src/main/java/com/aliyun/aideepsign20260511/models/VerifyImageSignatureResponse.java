// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class VerifyImageSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyImageSignatureResponseBody body;

    public static VerifyImageSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyImageSignatureResponse self = new VerifyImageSignatureResponse();
        return TeaModel.build(map, self);
    }

    public VerifyImageSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyImageSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyImageSignatureResponse setBody(VerifyImageSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyImageSignatureResponseBody getBody() {
        return this.body;
    }

}
