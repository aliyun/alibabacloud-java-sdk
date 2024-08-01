// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryInferenceJobInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody body;

    public static Personalizedtxt2imgQueryInferenceJobInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryInferenceJobInfoResponse self = new Personalizedtxt2imgQueryInferenceJobInfoResponse();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Personalizedtxt2imgQueryInferenceJobInfoResponse setBody(Personalizedtxt2imgQueryInferenceJobInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public Personalizedtxt2imgQueryInferenceJobInfoResponseBody getBody() {
        return this.body;
    }

}
