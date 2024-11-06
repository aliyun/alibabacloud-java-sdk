// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RgeoCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RgeoCodeResponseBody body;

    public static RgeoCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RgeoCodeResponse self = new RgeoCodeResponse();
        return TeaModel.build(map, self);
    }

    public RgeoCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RgeoCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RgeoCodeResponse setBody(RgeoCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RgeoCodeResponseBody getBody() {
        return this.body;
    }

}
