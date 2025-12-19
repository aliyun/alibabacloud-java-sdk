// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceAPIKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceAPIKeyResponseBody body;

    public static GetResourceAPIKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceAPIKeyResponse self = new GetResourceAPIKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceAPIKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceAPIKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceAPIKeyResponse setBody(GetResourceAPIKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceAPIKeyResponseBody getBody() {
        return this.body;
    }

}
