// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SmsConversionIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SmsConversionIntlResponseBody body;

    public static SmsConversionIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionIntlResponse self = new SmsConversionIntlResponse();
        return TeaModel.build(map, self);
    }

    public SmsConversionIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmsConversionIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmsConversionIntlResponse setBody(SmsConversionIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public SmsConversionIntlResponseBody getBody() {
        return this.body;
    }

}
