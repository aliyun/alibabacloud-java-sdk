// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetAccountSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountSettingsResponseBody body;

    public static GetAccountSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSettingsResponse self = new GetAccountSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountSettingsResponse setBody(GetAccountSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountSettingsResponseBody getBody() {
        return this.body;
    }

}
