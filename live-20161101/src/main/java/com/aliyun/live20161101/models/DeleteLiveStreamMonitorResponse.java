// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveStreamMonitorResponseBody body;

    public static DeleteLiveStreamMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamMonitorResponse self = new DeleteLiveStreamMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveStreamMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveStreamMonitorResponse setBody(DeleteLiveStreamMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

}
