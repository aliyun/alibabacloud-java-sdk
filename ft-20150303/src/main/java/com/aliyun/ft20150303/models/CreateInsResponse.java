// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class CreateInsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInsResponseBody body;

    public static CreateInsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInsResponse self = new CreateInsResponse();
        return TeaModel.build(map, self);
    }

    public CreateInsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInsResponse setBody(CreateInsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInsResponseBody getBody() {
        return this.body;
    }

}
