// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitHighlightExtractionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitHighlightExtractionJobResponseBody body;

    public static SubmitHighlightExtractionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHighlightExtractionJobResponse self = new SubmitHighlightExtractionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHighlightExtractionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitHighlightExtractionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitHighlightExtractionJobResponse setBody(SubmitHighlightExtractionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitHighlightExtractionJobResponseBody getBody() {
        return this.body;
    }

}
