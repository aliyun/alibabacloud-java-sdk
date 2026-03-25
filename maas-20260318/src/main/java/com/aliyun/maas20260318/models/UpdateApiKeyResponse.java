// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maas20260318.models;

import com.aliyun.tea.*;

public class UpdateApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApiKeyResponseBody body;

    public static UpdateApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyResponse self = new UpdateApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApiKeyResponse setBody(UpdateApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApiKeyResponseBody getBody() {
        return this.body;
    }

}
