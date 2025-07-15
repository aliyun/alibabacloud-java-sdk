// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LiveUpstreamQosDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LiveUpstreamQosDataResponseBody body;

    public static LiveUpstreamQosDataResponse build(java.util.Map<String, ?> map) throws Exception {
        LiveUpstreamQosDataResponse self = new LiveUpstreamQosDataResponse();
        return TeaModel.build(map, self);
    }

    public LiveUpstreamQosDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LiveUpstreamQosDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LiveUpstreamQosDataResponse setBody(LiveUpstreamQosDataResponseBody body) {
        this.body = body;
        return this;
    }
    public LiveUpstreamQosDataResponseBody getBody() {
        return this.body;
    }

}
