// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class StartUserAppAsyncEnhanceInMsaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartUserAppAsyncEnhanceInMsaResponseBody body;

    public static StartUserAppAsyncEnhanceInMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        StartUserAppAsyncEnhanceInMsaResponse self = new StartUserAppAsyncEnhanceInMsaResponse();
        return TeaModel.build(map, self);
    }

    public StartUserAppAsyncEnhanceInMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartUserAppAsyncEnhanceInMsaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartUserAppAsyncEnhanceInMsaResponse setBody(StartUserAppAsyncEnhanceInMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public StartUserAppAsyncEnhanceInMsaResponseBody getBody() {
        return this.body;
    }

}
