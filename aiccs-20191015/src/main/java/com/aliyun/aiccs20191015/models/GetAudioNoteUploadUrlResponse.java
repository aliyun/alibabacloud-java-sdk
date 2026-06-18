// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAudioNoteUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAudioNoteUploadUrlResponseBody body;

    public static GetAudioNoteUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioNoteUploadUrlResponse self = new GetAudioNoteUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioNoteUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioNoteUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAudioNoteUploadUrlResponse setBody(GetAudioNoteUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioNoteUploadUrlResponseBody getBody() {
        return this.body;
    }

}
