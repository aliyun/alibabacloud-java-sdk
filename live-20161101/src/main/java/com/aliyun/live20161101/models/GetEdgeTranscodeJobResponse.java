// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEdgeTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeTranscodeJobResponseBody body;

    public static GetEdgeTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeTranscodeJobResponse self = new GetEdgeTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeTranscodeJobResponse setBody(GetEdgeTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
