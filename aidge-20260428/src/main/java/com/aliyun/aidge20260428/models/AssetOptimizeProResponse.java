// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AssetOptimizeProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssetOptimizeProResponseBody body;

    public static AssetOptimizeProResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetOptimizeProResponse self = new AssetOptimizeProResponse();
        return TeaModel.build(map, self);
    }

    public AssetOptimizeProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssetOptimizeProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssetOptimizeProResponse setBody(AssetOptimizeProResponseBody body) {
        this.body = body;
        return this;
    }
    public AssetOptimizeProResponseBody getBody() {
        return this.body;
    }

}
