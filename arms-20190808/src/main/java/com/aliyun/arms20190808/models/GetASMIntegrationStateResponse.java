// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetASMIntegrationStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetASMIntegrationStateResponseBody body;

    public static GetASMIntegrationStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetASMIntegrationStateResponse self = new GetASMIntegrationStateResponse();
        return TeaModel.build(map, self);
    }

    public GetASMIntegrationStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetASMIntegrationStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetASMIntegrationStateResponse setBody(GetASMIntegrationStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetASMIntegrationStateResponseBody getBody() {
        return this.body;
    }

}
