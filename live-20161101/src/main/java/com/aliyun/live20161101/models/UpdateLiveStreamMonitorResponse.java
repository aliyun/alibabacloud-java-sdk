// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveStreamMonitorResponseBody body;

    public static UpdateLiveStreamMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamMonitorResponse self = new UpdateLiveStreamMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveStreamMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveStreamMonitorResponse setBody(UpdateLiveStreamMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

}
