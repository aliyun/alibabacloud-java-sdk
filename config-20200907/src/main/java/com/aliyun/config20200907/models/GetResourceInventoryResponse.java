// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceInventoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceInventoryResponseBody body;

    public static GetResourceInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceInventoryResponse self = new GetResourceInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceInventoryResponse setBody(GetResourceInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceInventoryResponseBody getBody() {
        return this.body;
    }

}
