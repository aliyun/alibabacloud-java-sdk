// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetAccountSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAccountSettingsResponse setBody(GetAccountSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountSettingsResponseBody getBody() {
        return this.body;
    }

}
