// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIntegrationTokenResponseBody body;

    public static GetIntegrationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationTokenResponse self = new GetIntegrationTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetIntegrationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntegrationTokenResponse setBody(GetIntegrationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntegrationTokenResponseBody getBody() {
        return this.body;
    }

}
