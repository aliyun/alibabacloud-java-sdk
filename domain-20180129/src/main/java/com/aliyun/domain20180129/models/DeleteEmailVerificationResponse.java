// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEmailVerificationResponseBody body;

    public static DeleteEmailVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEmailVerificationResponse self = new DeleteEmailVerificationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEmailVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEmailVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEmailVerificationResponse setBody(DeleteEmailVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEmailVerificationResponseBody getBody() {
        return this.body;
    }

}
