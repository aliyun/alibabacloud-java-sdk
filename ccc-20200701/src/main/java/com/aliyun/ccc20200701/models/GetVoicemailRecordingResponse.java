// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetVoicemailRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVoicemailRecordingResponseBody body;

    public static GetVoicemailRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVoicemailRecordingResponse self = new GetVoicemailRecordingResponse();
        return TeaModel.build(map, self);
    }

    public GetVoicemailRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVoicemailRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVoicemailRecordingResponse setBody(GetVoicemailRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVoicemailRecordingResponseBody getBody() {
        return this.body;
    }

}
