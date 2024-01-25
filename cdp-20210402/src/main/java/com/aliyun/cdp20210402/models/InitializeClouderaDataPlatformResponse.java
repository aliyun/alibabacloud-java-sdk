// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class InitializeClouderaDataPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public InitializeClouderaDataPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeClouderaDataPlatformResponse setBody(InitializeClouderaDataPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeClouderaDataPlatformResponseBody getBody() {
        return this.body;
    }

}
