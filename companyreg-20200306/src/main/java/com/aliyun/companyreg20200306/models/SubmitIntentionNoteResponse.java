// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class SubmitIntentionNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitIntentionNoteResponseBody body;

    public static SubmitIntentionNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIntentionNoteResponse self = new SubmitIntentionNoteResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIntentionNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIntentionNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIntentionNoteResponse setBody(SubmitIntentionNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIntentionNoteResponseBody getBody() {
        return this.body;
    }

}
