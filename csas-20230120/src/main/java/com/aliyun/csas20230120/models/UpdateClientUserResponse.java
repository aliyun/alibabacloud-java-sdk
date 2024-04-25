// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClientUserResponseBody body;

    public static UpdateClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserResponse self = new UpdateClientUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClientUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClientUserResponse setBody(UpdateClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClientUserResponseBody getBody() {
        return this.body;
    }

}
