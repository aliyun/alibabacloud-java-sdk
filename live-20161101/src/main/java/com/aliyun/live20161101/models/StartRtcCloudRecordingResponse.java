// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRtcCloudRecordingResponseBody body;

    public static StartRtcCloudRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRtcCloudRecordingResponse self = new StartRtcCloudRecordingResponse();
        return TeaModel.build(map, self);
    }

    public StartRtcCloudRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRtcCloudRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRtcCloudRecordingResponse setBody(StartRtcCloudRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRtcCloudRecordingResponseBody getBody() {
        return this.body;
    }

}
