// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateEdgeTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEdgeTranscodeJobResponseBody body;

    public static UpdateEdgeTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeTranscodeJobResponse self = new UpdateEdgeTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeTranscodeJobResponse setBody(UpdateEdgeTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
