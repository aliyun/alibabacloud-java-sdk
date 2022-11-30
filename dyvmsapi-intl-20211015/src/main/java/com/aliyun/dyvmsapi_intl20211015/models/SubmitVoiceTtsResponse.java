// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitVoiceTtsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitVoiceTtsResponseBody body;

    public static SubmitVoiceTtsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVoiceTtsResponse self = new SubmitVoiceTtsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVoiceTtsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVoiceTtsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVoiceTtsResponse setBody(SubmitVoiceTtsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVoiceTtsResponseBody getBody() {
        return this.body;
    }

}
