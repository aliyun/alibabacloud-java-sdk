// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMFAAuthenticationSettingsResponseBody body;

    public static GetMFAAuthenticationSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMFAAuthenticationSettingsResponse self = new GetMFAAuthenticationSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetMFAAuthenticationSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMFAAuthenticationSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMFAAuthenticationSettingsResponse setBody(GetMFAAuthenticationSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMFAAuthenticationSettingsResponseBody getBody() {
        return this.body;
    }

}
