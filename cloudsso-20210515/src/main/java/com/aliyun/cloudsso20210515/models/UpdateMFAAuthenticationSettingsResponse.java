// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateMFAAuthenticationSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMFAAuthenticationSettingsResponseBody body;

    public static UpdateMFAAuthenticationSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMFAAuthenticationSettingsResponse self = new UpdateMFAAuthenticationSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMFAAuthenticationSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMFAAuthenticationSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMFAAuthenticationSettingsResponse setBody(UpdateMFAAuthenticationSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMFAAuthenticationSettingsResponseBody getBody() {
        return this.body;
    }

}
