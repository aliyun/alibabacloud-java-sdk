// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveStreamWatermarkResponseBody body;

    public static AddLiveStreamWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamWatermarkResponse self = new AddLiveStreamWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveStreamWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveStreamWatermarkResponse setBody(AddLiveStreamWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveStreamWatermarkResponseBody getBody() {
        return this.body;
    }

}
