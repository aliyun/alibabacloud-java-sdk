// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateResourceInventoryResponseBody body;

    public static GetAggregateResourceInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceInventoryResponse self = new GetAggregateResourceInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceInventoryResponse setBody(GetAggregateResourceInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceInventoryResponseBody getBody() {
        return this.body;
    }

}
