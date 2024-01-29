// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateResourceInventoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAggregateResourceInventoryResponseBody body;

    public static GenerateAggregateResourceInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateResourceInventoryResponse self = new GenerateAggregateResourceInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateResourceInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAggregateResourceInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAggregateResourceInventoryResponse setBody(GenerateAggregateResourceInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAggregateResourceInventoryResponseBody getBody() {
        return this.body;
    }

}
