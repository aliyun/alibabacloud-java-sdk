// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitVoiceFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitVoiceFileResponseBody body;

    public static SubmitVoiceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVoiceFileResponse self = new SubmitVoiceFileResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVoiceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVoiceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVoiceFileResponse setBody(SubmitVoiceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVoiceFileResponseBody getBody() {
        return this.body;
    }

}
