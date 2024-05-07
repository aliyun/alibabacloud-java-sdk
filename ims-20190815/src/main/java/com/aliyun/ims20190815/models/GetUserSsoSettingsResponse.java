// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserSsoSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserSsoSettingsResponseBody body;

    public static GetUserSsoSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserSsoSettingsResponse self = new GetUserSsoSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserSsoSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserSsoSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserSsoSettingsResponse setBody(GetUserSsoSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserSsoSettingsResponseBody getBody() {
        return this.body;
    }

}
