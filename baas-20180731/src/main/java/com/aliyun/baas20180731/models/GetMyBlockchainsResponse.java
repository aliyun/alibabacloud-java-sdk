// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetMyBlockchainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMyBlockchainsResponseBody body;

    public static GetMyBlockchainsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyBlockchainsResponse self = new GetMyBlockchainsResponse();
        return TeaModel.build(map, self);
    }

    public GetMyBlockchainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyBlockchainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyBlockchainsResponse setBody(GetMyBlockchainsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyBlockchainsResponseBody getBody() {
        return this.body;
    }

}
