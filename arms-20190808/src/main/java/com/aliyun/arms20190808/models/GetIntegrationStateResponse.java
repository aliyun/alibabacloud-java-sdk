// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIntegrationStateResponseBody body;

    public static GetIntegrationStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationStateResponse self = new GetIntegrationStateResponse();
        return TeaModel.build(map, self);
    }

    public GetIntegrationStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntegrationStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntegrationStateResponse setBody(GetIntegrationStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntegrationStateResponseBody getBody() {
        return this.body;
    }

}
