// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class StartUserAppAsyncEnhanceInMsaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StartUserAppAsyncEnhanceInMsaResponse setBody(StartUserAppAsyncEnhanceInMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public StartUserAppAsyncEnhanceInMsaResponseBody getBody() {
        return this.body;
    }

}
