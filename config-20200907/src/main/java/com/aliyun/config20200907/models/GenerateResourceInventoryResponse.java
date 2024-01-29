// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateResourceInventoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateResourceInventoryResponseBody body;

    public static GenerateResourceInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateResourceInventoryResponse self = new GenerateResourceInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GenerateResourceInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateResourceInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateResourceInventoryResponse setBody(GenerateResourceInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateResourceInventoryResponseBody getBody() {
        return this.body;
    }

}
