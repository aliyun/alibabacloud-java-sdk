// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateNetworkOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkOptimizationResponseBody body;

    public static CreateNetworkOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkOptimizationResponse self = new CreateNetworkOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkOptimizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkOptimizationResponse setBody(CreateNetworkOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkOptimizationResponseBody getBody() {
        return this.body;
    }

}
