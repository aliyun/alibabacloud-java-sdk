// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class EkycVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EkycVerifyResponseBody body;

    public static EkycVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        EkycVerifyResponse self = new EkycVerifyResponse();
        return TeaModel.build(map, self);
    }

    public EkycVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EkycVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EkycVerifyResponse setBody(EkycVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public EkycVerifyResponseBody getBody() {
        return this.body;
    }

}
