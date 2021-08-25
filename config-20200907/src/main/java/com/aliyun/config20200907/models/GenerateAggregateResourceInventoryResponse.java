// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateResourceInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GenerateAggregateResourceInventoryResponse setBody(GenerateAggregateResourceInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAggregateResourceInventoryResponseBody getBody() {
        return this.body;
    }

}
