// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdminPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAdminPasswordResponseBody body;

    public static UpdateAdminPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdminPasswordResponse self = new UpdateAdminPasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAdminPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAdminPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAdminPasswordResponse setBody(UpdateAdminPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdminPasswordResponseBody getBody() {
        return this.body;
    }

}
