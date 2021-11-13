// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class InitializeClouderaDataPlatformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeClouderaDataPlatformResponseBody body;

    public static InitializeClouderaDataPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeClouderaDataPlatformResponse self = new InitializeClouderaDataPlatformResponse();
        return TeaModel.build(map, self);
    }

    public InitializeClouderaDataPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeClouderaDataPlatformResponse setBody(InitializeClouderaDataPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeClouderaDataPlatformResponseBody getBody() {
        return this.body;
    }

}
