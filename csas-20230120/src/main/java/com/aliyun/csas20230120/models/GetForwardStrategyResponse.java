// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetForwardStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetForwardStrategyResponseBody body;

    public static GetForwardStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetForwardStrategyResponse self = new GetForwardStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetForwardStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetForwardStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetForwardStrategyResponse setBody(GetForwardStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetForwardStrategyResponseBody getBody() {
        return this.body;
    }

}
