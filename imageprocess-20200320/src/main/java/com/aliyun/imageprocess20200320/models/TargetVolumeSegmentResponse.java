// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TargetVolumeSegmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TargetVolumeSegmentResponseBody body;

    public static TargetVolumeSegmentResponse build(java.util.Map<String, ?> map) throws Exception {
        TargetVolumeSegmentResponse self = new TargetVolumeSegmentResponse();
        return TeaModel.build(map, self);
    }

    public TargetVolumeSegmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TargetVolumeSegmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TargetVolumeSegmentResponse setBody(TargetVolumeSegmentResponseBody body) {
        this.body = body;
        return this;
    }
    public TargetVolumeSegmentResponseBody getBody() {
        return this.body;
    }

}
