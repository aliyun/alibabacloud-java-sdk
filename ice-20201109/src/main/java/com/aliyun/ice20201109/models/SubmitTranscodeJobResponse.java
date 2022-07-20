// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTranscodeJobResponseBody body;

    public static SubmitTranscodeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobResponse self = new SubmitTranscodeJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTranscodeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTranscodeJobResponse setBody(SubmitTranscodeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTranscodeJobResponseBody getBody() {
        return this.body;
    }

}
