// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateShortUrlNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateShortUrlNewResponseBody body;

    public static CreateShortUrlNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShortUrlNewResponse self = new CreateShortUrlNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateShortUrlNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShortUrlNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateShortUrlNewResponse setBody(CreateShortUrlNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShortUrlNewResponseBody getBody() {
        return this.body;
    }

}
