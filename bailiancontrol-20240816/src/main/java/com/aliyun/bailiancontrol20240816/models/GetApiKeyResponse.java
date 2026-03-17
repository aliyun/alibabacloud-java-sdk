// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailiancontrol20240816.models;

import com.aliyun.tea.*;

public class GetApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiKeyResponseBody body;

    public static GetApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiKeyResponse self = new GetApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiKeyResponse setBody(GetApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiKeyResponseBody getBody() {
        return this.body;
    }

}
