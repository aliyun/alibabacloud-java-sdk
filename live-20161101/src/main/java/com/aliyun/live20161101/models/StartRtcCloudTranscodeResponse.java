// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRtcCloudTranscodeResponseBody body;

    public static StartRtcCloudTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRtcCloudTranscodeResponse self = new StartRtcCloudTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public StartRtcCloudTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRtcCloudTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRtcCloudTranscodeResponse setBody(StartRtcCloudTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRtcCloudTranscodeResponseBody getBody() {
        return this.body;
    }

}
