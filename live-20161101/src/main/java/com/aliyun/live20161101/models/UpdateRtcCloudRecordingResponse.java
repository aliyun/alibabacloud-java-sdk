// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtcCloudRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRtcCloudRecordingResponseBody body;

    public static UpdateRtcCloudRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcCloudRecordingResponse self = new UpdateRtcCloudRecordingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRtcCloudRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRtcCloudRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRtcCloudRecordingResponse setBody(UpdateRtcCloudRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRtcCloudRecordingResponseBody getBody() {
        return this.body;
    }

}
