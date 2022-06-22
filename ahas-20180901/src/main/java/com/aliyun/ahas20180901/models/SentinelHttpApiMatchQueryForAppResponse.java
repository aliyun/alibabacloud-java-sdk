// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchQueryForAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHttpApiMatchQueryForAppResponseBody body;

    public static SentinelHttpApiMatchQueryForAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchQueryForAppResponse self = new SentinelHttpApiMatchQueryForAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchQueryForAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHttpApiMatchQueryForAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHttpApiMatchQueryForAppResponse setBody(SentinelHttpApiMatchQueryForAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHttpApiMatchQueryForAppResponseBody getBody() {
        return this.body;
    }

}
