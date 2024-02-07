// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserMFAAuthenticationSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserMFAAuthenticationSettingsResponseBody body;

    public static UpdateUserMFAAuthenticationSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserMFAAuthenticationSettingsResponse self = new UpdateUserMFAAuthenticationSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserMFAAuthenticationSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserMFAAuthenticationSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserMFAAuthenticationSettingsResponse setBody(UpdateUserMFAAuthenticationSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserMFAAuthenticationSettingsResponseBody getBody() {
        return this.body;
    }

}
