// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEventSubResponseBody body;

    public static CreateEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSubResponse self = new CreateEventSubResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEventSubResponse setBody(CreateEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventSubResponseBody getBody() {
        return this.body;
    }

}
