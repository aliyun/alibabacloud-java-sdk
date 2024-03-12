// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserResponseBody body;

    public static UpdateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserResponse self = new UpdateUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserResponse setBody(UpdateUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserResponseBody getBody() {
        return this.body;
    }

}
