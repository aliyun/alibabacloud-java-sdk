// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteShortUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteShortUrlResponseBody body;

    public static DeleteShortUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteShortUrlResponse self = new DeleteShortUrlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteShortUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteShortUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteShortUrlResponse setBody(DeleteShortUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteShortUrlResponseBody getBody() {
        return this.body;
    }

}
