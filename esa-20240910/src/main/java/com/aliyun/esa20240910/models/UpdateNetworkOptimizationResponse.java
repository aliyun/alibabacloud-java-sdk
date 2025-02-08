// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateNetworkOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNetworkOptimizationResponseBody body;

    public static UpdateNetworkOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkOptimizationResponse self = new UpdateNetworkOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkOptimizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkOptimizationResponse setBody(UpdateNetworkOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkOptimizationResponseBody getBody() {
        return this.body;
    }

}
