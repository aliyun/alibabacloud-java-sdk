// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteShortUrlNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteShortUrlNewResponseBody body;

    public static DeleteShortUrlNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteShortUrlNewResponse self = new DeleteShortUrlNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteShortUrlNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteShortUrlNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteShortUrlNewResponse setBody(DeleteShortUrlNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteShortUrlNewResponseBody getBody() {
        return this.body;
    }

}
