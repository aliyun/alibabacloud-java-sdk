// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteNetworkOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkOptimizationResponseBody body;

    public static DeleteNetworkOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkOptimizationResponse self = new DeleteNetworkOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkOptimizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkOptimizationResponse setBody(DeleteNetworkOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkOptimizationResponseBody getBody() {
        return this.body;
    }

}
