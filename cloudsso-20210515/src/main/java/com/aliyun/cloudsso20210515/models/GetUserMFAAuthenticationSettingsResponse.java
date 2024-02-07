// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserMFAAuthenticationSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserMFAAuthenticationSettingsResponseBody body;

    public static GetUserMFAAuthenticationSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAAuthenticationSettingsResponse self = new GetUserMFAAuthenticationSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserMFAAuthenticationSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserMFAAuthenticationSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserMFAAuthenticationSettingsResponse setBody(GetUserMFAAuthenticationSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserMFAAuthenticationSettingsResponseBody getBody() {
        return this.body;
    }

}
