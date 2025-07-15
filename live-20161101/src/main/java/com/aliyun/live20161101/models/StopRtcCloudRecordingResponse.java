// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopRtcCloudRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRtcCloudRecordingResponseBody body;

    public static StopRtcCloudRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRtcCloudRecordingResponse self = new StopRtcCloudRecordingResponse();
        return TeaModel.build(map, self);
    }

    public StopRtcCloudRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRtcCloudRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRtcCloudRecordingResponse setBody(StopRtcCloudRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRtcCloudRecordingResponseBody getBody() {
        return this.body;
    }

}
