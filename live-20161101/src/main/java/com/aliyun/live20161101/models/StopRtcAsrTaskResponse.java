// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopRtcAsrTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRtcAsrTaskResponseBody body;

    public static StopRtcAsrTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRtcAsrTaskResponse self = new StopRtcAsrTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopRtcAsrTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRtcAsrTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRtcAsrTaskResponse setBody(StopRtcAsrTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRtcAsrTaskResponseBody getBody() {
        return this.body;
    }

}
