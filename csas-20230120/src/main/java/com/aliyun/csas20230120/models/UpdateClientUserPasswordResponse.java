// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClientUserPasswordResponseBody body;

    public static UpdateClientUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserPasswordResponse self = new UpdateClientUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClientUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClientUserPasswordResponse setBody(UpdateClientUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClientUserPasswordResponseBody getBody() {
        return this.body;
    }

}
