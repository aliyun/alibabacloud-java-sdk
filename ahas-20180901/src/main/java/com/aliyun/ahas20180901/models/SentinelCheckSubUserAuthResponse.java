// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelCheckSubUserAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelCheckSubUserAuthResponseBody body;

    public static SentinelCheckSubUserAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelCheckSubUserAuthResponse self = new SentinelCheckSubUserAuthResponse();
        return TeaModel.build(map, self);
    }

    public SentinelCheckSubUserAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelCheckSubUserAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelCheckSubUserAuthResponse setBody(SentinelCheckSubUserAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelCheckSubUserAuthResponseBody getBody() {
        return this.body;
    }

}
