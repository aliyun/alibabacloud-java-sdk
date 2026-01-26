// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class VerifyCustomHostnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyCustomHostnameResponseBody body;

    public static VerifyCustomHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCustomHostnameResponse self = new VerifyCustomHostnameResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCustomHostnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCustomHostnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyCustomHostnameResponse setBody(VerifyCustomHostnameResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCustomHostnameResponseBody getBody() {
        return this.body;
    }

}
