// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BookResponseBody body;

    public static BookResponse build(java.util.Map<String, ?> map) throws Exception {
        BookResponse self = new BookResponse();
        return TeaModel.build(map, self);
    }

    public BookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BookResponse setBody(BookResponseBody body) {
        this.body = body;
        return this;
    }
    public BookResponseBody getBody() {
        return this.body;
    }

}
