// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHttpApiMatchNewResponseBody body;

    public static SentinelHttpApiMatchNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchNewResponse self = new SentinelHttpApiMatchNewResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHttpApiMatchNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHttpApiMatchNewResponse setBody(SentinelHttpApiMatchNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHttpApiMatchNewResponseBody getBody() {
        return this.body;
    }

}
