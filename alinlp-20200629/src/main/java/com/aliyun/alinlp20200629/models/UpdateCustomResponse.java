// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class UpdateCustomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCustomResponseBody body;

    public static UpdateCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomResponse self = new UpdateCustomResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomResponse setBody(UpdateCustomResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomResponseBody getBody() {
        return this.body;
    }

}
