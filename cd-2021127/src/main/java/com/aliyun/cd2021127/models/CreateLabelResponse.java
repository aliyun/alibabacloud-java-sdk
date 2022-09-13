// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLabelResponseBody body;

    public static CreateLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelResponse self = new CreateLabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLabelResponse setBody(CreateLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLabelResponseBody getBody() {
        return this.body;
    }

}
