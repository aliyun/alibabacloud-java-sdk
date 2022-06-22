// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppResourceEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppResourceEventsResponseBody body;

    public static SentinelAppResourceEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppResourceEventsResponse self = new SentinelAppResourceEventsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppResourceEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppResourceEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppResourceEventsResponse setBody(SentinelAppResourceEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppResourceEventsResponseBody getBody() {
        return this.body;
    }

}
