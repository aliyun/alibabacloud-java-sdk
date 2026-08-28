// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RefreshPluginOAuthCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshPluginOAuthCodeResponseBody body;

    public static RefreshPluginOAuthCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshPluginOAuthCodeResponse self = new RefreshPluginOAuthCodeResponse();
        return TeaModel.build(map, self);
    }

    public RefreshPluginOAuthCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshPluginOAuthCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshPluginOAuthCodeResponse setBody(RefreshPluginOAuthCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshPluginOAuthCodeResponseBody getBody() {
        return this.body;
    }

}
