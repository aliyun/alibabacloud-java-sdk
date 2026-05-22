// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class DisableApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApiKeyResponseBody body;

    public static DisableApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApiKeyResponse self = new DisableApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public DisableApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApiKeyResponse setBody(DisableApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApiKeyResponseBody getBody() {
        return this.body;
    }

}
