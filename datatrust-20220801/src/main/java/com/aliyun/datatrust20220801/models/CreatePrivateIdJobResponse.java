// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreatePrivateIdJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePrivateIdJobResponseBody body;

    public static CreatePrivateIdJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateIdJobResponse self = new CreatePrivateIdJobResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivateIdJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrivateIdJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrivateIdJobResponse setBody(CreatePrivateIdJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrivateIdJobResponseBody getBody() {
        return this.body;
    }

}
