// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveStreamMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartLiveStreamMonitorResponseBody body;

    public static StartLiveStreamMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLiveStreamMonitorResponse self = new StartLiveStreamMonitorResponse();
        return TeaModel.build(map, self);
    }

    public StartLiveStreamMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLiveStreamMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartLiveStreamMonitorResponse setBody(StartLiveStreamMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

}
