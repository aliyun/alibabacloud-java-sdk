// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmartShortUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmartShortUrlResponseBody body;

    public static CreateSmartShortUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartShortUrlResponse self = new CreateSmartShortUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmartShortUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmartShortUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmartShortUrlResponse setBody(CreateSmartShortUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmartShortUrlResponseBody getBody() {
        return this.body;
    }

}
