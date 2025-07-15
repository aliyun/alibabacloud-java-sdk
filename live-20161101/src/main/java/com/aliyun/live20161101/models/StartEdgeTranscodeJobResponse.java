// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartEdgeTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartEdgeTranscodeJobResponseBody body;

    public static StartEdgeTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEdgeTranscodeJobResponse self = new StartEdgeTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public StartEdgeTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartEdgeTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartEdgeTranscodeJobResponse setBody(StartEdgeTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartEdgeTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
