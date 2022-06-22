// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelModifyAppPriceLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelModifyAppPriceLevelResponseBody body;

    public static SentinelModifyAppPriceLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelModifyAppPriceLevelResponse self = new SentinelModifyAppPriceLevelResponse();
        return TeaModel.build(map, self);
    }

    public SentinelModifyAppPriceLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelModifyAppPriceLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelModifyAppPriceLevelResponse setBody(SentinelModifyAppPriceLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelModifyAppPriceLevelResponseBody getBody() {
        return this.body;
    }

}
