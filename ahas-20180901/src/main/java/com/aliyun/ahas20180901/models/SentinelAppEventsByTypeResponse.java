// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppEventsByTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppEventsByTypeResponseBody body;

    public static SentinelAppEventsByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppEventsByTypeResponse self = new SentinelAppEventsByTypeResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppEventsByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppEventsByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppEventsByTypeResponse setBody(SentinelAppEventsByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppEventsByTypeResponseBody getBody() {
        return this.body;
    }

}
