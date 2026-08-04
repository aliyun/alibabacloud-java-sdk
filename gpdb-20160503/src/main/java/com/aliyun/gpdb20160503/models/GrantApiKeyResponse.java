// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GrantApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantApiKeyResponseBody body;

    public static GrantApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantApiKeyResponse self = new GrantApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public GrantApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantApiKeyResponse setBody(GrantApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantApiKeyResponseBody getBody() {
        return this.body;
    }

}
