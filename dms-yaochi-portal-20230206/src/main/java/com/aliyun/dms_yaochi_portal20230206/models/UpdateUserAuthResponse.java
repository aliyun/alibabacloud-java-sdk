// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class UpdateUserAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserAuthResponseBody body;

    public static UpdateUserAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthResponse self = new UpdateUserAuthResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserAuthResponse setBody(UpdateUserAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserAuthResponseBody getBody() {
        return this.body;
    }

}
