// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveStreamWatermarkResponseBody body;

    public static UpdateLiveStreamWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamWatermarkResponse self = new UpdateLiveStreamWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveStreamWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveStreamWatermarkResponse setBody(UpdateLiveStreamWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveStreamWatermarkResponseBody getBody() {
        return this.body;
    }

}
