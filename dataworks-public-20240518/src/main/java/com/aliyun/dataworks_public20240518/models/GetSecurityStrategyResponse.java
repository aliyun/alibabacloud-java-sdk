// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSecurityStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecurityStrategyResponseBody body;

    public static GetSecurityStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityStrategyResponse self = new GetSecurityStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecurityStrategyResponse setBody(GetSecurityStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityStrategyResponseBody getBody() {
        return this.body;
    }

}
