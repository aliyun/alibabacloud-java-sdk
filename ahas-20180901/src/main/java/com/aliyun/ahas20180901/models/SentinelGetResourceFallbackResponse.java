// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetResourceFallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetResourceFallbackResponseBody body;

    public static SentinelGetResourceFallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetResourceFallbackResponse self = new SentinelGetResourceFallbackResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetResourceFallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetResourceFallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetResourceFallbackResponse setBody(SentinelGetResourceFallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetResourceFallbackResponseBody getBody() {
        return this.body;
    }

}
