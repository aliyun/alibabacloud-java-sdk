// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopRtcCloudTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRtcCloudTranscodeResponseBody body;

    public static StopRtcCloudTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRtcCloudTranscodeResponse self = new StopRtcCloudTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public StopRtcCloudTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRtcCloudTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRtcCloudTranscodeResponse setBody(StopRtcCloudTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRtcCloudTranscodeResponseBody getBody() {
        return this.body;
    }

}
