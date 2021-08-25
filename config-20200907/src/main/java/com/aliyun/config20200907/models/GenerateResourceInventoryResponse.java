// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateResourceInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GenerateResourceInventoryResponse setBody(GenerateResourceInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateResourceInventoryResponseBody getBody() {
        return this.body;
    }

}
