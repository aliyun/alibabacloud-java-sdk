// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class StopOnlineTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopOnlineTestResponseBody body;

    public static StopOnlineTestResponse build(java.util.Map<String, ?> map) throws Exception {
        StopOnlineTestResponse self = new StopOnlineTestResponse();
        return TeaModel.build(map, self);
    }

    public StopOnlineTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopOnlineTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopOnlineTestResponse setBody(StopOnlineTestResponseBody body) {
        this.body = body;
        return this;
    }
    public StopOnlineTestResponseBody getBody() {
        return this.body;
    }

}
