// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UAIDConversionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UAIDConversionResponseBody body;

    public static UAIDConversionResponse build(java.util.Map<String, ?> map) throws Exception {
        UAIDConversionResponse self = new UAIDConversionResponse();
        return TeaModel.build(map, self);
    }

    public UAIDConversionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UAIDConversionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UAIDConversionResponse setBody(UAIDConversionResponseBody body) {
        this.body = body;
        return this;
    }
    public UAIDConversionResponseBody getBody() {
        return this.body;
    }

}
