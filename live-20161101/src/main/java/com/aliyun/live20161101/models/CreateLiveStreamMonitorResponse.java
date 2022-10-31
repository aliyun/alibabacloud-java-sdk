// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLiveStreamMonitorResponseBody body;

    public static CreateLiveStreamMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamMonitorResponse self = new CreateLiveStreamMonitorResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveStreamMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveStreamMonitorResponse setBody(CreateLiveStreamMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

}
