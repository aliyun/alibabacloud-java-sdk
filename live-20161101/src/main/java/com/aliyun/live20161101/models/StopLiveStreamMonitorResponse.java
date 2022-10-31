// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveStreamMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopLiveStreamMonitorResponseBody body;

    public static StopLiveStreamMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveStreamMonitorResponse self = new StopLiveStreamMonitorResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveStreamMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveStreamMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLiveStreamMonitorResponse setBody(StopLiveStreamMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

}
