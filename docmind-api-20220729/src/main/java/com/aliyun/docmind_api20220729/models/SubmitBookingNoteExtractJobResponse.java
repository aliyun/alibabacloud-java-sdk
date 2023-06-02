// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitBookingNoteExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitBookingNoteExtractJobResponseBody body;

    public static SubmitBookingNoteExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBookingNoteExtractJobResponse self = new SubmitBookingNoteExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBookingNoteExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBookingNoteExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBookingNoteExtractJobResponse setBody(SubmitBookingNoteExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBookingNoteExtractJobResponseBody getBody() {
        return this.body;
    }

}
