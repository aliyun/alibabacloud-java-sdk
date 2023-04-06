// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserPasswordResponseBody body;

    public static UpdateUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPasswordResponse self = new UpdateUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserPasswordResponse setBody(UpdateUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserPasswordResponseBody getBody() {
        return this.body;
    }

}
