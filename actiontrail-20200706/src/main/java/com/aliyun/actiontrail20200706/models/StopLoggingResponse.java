// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class StopLoggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLoggingResponseBody body;

    public static StopLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLoggingResponse self = new StopLoggingResponse();
        return TeaModel.build(map, self);
    }

    public StopLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLoggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLoggingResponse setBody(StopLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLoggingResponseBody getBody() {
        return this.body;
    }

}
