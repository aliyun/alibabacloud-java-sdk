// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopEdgeTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopEdgeTranscodeJobResponseBody body;

    public static StopEdgeTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopEdgeTranscodeJobResponse self = new StopEdgeTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public StopEdgeTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopEdgeTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopEdgeTranscodeJobResponse setBody(StopEdgeTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopEdgeTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
