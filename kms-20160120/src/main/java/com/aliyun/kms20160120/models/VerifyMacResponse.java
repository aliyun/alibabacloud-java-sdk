// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class VerifyMacResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyMacResponseBody body;

    public static VerifyMacResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMacResponse self = new VerifyMacResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMacResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyMacResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyMacResponse setBody(VerifyMacResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyMacResponseBody getBody() {
        return this.body;
    }

}
