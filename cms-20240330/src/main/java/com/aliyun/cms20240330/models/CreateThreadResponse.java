// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateThreadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateThreadResponseBody body;

    public static CreateThreadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateThreadResponse self = new CreateThreadResponse();
        return TeaModel.build(map, self);
    }

    public CreateThreadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateThreadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateThreadResponse setBody(CreateThreadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateThreadResponseBody getBody() {
        return this.body;
    }

}
