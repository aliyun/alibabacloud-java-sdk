// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetNetworkOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkOptimizationResponseBody body;

    public static GetNetworkOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkOptimizationResponse self = new GetNetworkOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkOptimizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkOptimizationResponse setBody(GetNetworkOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkOptimizationResponseBody getBody() {
        return this.body;
    }

}
