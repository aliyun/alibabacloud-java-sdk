// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class EnableApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApiKeyResponseBody body;

    public static EnableApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApiKeyResponse self = new EnableApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public EnableApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApiKeyResponse setBody(EnableApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApiKeyResponseBody getBody() {
        return this.body;
    }

}
