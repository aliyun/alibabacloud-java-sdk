// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OpenAhasCommercialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenAhasCommercialResponseBody body;

    public static OpenAhasCommercialResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAhasCommercialResponse self = new OpenAhasCommercialResponse();
        return TeaModel.build(map, self);
    }

    public OpenAhasCommercialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAhasCommercialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenAhasCommercialResponse setBody(OpenAhasCommercialResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAhasCommercialResponseBody getBody() {
        return this.body;
    }

}
