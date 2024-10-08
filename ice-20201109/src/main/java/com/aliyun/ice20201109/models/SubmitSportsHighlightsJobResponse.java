// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSportsHighlightsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSportsHighlightsJobResponseBody body;

    public static SubmitSportsHighlightsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSportsHighlightsJobResponse self = new SubmitSportsHighlightsJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSportsHighlightsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSportsHighlightsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSportsHighlightsJobResponse setBody(SubmitSportsHighlightsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSportsHighlightsJobResponseBody getBody() {
        return this.body;
    }

}
