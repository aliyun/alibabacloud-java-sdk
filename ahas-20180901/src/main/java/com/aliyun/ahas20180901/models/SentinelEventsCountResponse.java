// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelEventsCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelEventsCountResponseBody body;

    public static SentinelEventsCountResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelEventsCountResponse self = new SentinelEventsCountResponse();
        return TeaModel.build(map, self);
    }

    public SentinelEventsCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelEventsCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelEventsCountResponse setBody(SentinelEventsCountResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelEventsCountResponseBody getBody() {
        return this.body;
    }

}
