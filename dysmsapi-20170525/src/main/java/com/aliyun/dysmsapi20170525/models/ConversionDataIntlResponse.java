// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ConversionDataIntlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConversionDataIntlResponseBody body;

    public static ConversionDataIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataIntlResponse self = new ConversionDataIntlResponse();
        return TeaModel.build(map, self);
    }

    public ConversionDataIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConversionDataIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConversionDataIntlResponse setBody(ConversionDataIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public ConversionDataIntlResponseBody getBody() {
        return this.body;
    }

}
