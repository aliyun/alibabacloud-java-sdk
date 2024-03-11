// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class ConversionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConversionDataResponseBody body;

    public static ConversionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataResponse self = new ConversionDataResponse();
        return TeaModel.build(map, self);
    }

    public ConversionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConversionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConversionDataResponse setBody(ConversionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ConversionDataResponseBody getBody() {
        return this.body;
    }

}
