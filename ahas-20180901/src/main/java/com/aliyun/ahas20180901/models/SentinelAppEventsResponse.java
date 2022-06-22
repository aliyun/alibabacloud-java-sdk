// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppEventsResponseBody body;

    public static SentinelAppEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppEventsResponse self = new SentinelAppEventsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppEventsResponse setBody(SentinelAppEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppEventsResponseBody getBody() {
        return this.body;
    }

}
