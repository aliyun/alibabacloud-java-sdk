// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AssetOptimizeLiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssetOptimizeLiteResponseBody body;

    public static AssetOptimizeLiteResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetOptimizeLiteResponse self = new AssetOptimizeLiteResponse();
        return TeaModel.build(map, self);
    }

    public AssetOptimizeLiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssetOptimizeLiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssetOptimizeLiteResponse setBody(AssetOptimizeLiteResponseBody body) {
        this.body = body;
        return this;
    }
    public AssetOptimizeLiteResponseBody getBody() {
        return this.body;
    }

}
