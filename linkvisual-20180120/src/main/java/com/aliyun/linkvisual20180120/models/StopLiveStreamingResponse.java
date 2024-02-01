// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class StopLiveStreamingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLiveStreamingResponseBody body;

    public static StopLiveStreamingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveStreamingResponse self = new StopLiveStreamingResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveStreamingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveStreamingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLiveStreamingResponse setBody(StopLiveStreamingResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveStreamingResponseBody getBody() {
        return this.body;
    }

}
