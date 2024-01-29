// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitLiveTranscodeJobResponseBody body;

    public static SubmitLiveTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveTranscodeJobResponse self = new SubmitLiveTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitLiveTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitLiveTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitLiveTranscodeJobResponse setBody(SubmitLiveTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitLiveTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
