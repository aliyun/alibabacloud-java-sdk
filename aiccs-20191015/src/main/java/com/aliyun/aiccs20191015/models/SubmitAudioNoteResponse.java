// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SubmitAudioNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAudioNoteResponseBody body;

    public static SubmitAudioNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioNoteResponse self = new SubmitAudioNoteResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAudioNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAudioNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAudioNoteResponse setBody(SubmitAudioNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAudioNoteResponseBody getBody() {
        return this.body;
    }

}
