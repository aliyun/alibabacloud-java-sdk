// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitScreenMediaHighlightsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitScreenMediaHighlightsJobResponseBody body;

    public static SubmitScreenMediaHighlightsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitScreenMediaHighlightsJobResponse self = new SubmitScreenMediaHighlightsJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitScreenMediaHighlightsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitScreenMediaHighlightsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitScreenMediaHighlightsJobResponse setBody(SubmitScreenMediaHighlightsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitScreenMediaHighlightsJobResponseBody getBody() {
        return this.body;
    }

}
