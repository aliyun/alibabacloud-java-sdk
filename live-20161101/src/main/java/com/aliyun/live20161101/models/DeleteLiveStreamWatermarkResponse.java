// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveStreamWatermarkResponseBody body;

    public static DeleteLiveStreamWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamWatermarkResponse self = new DeleteLiveStreamWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveStreamWatermarkResponse setBody(DeleteLiveStreamWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamWatermarkResponseBody getBody() {
        return this.body;
    }

}
