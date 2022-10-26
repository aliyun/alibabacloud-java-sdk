// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreatePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePropertyResponseBody body;

    public static CreatePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePropertyResponse self = new CreatePropertyResponse();
        return TeaModel.build(map, self);
    }

    public CreatePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePropertyResponse setBody(CreatePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePropertyResponseBody getBody() {
        return this.body;
    }

}
