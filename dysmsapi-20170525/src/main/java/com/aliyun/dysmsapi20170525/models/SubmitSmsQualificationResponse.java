// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SubmitSmsQualificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSmsQualificationResponseBody body;

    public static SubmitSmsQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmsQualificationResponse self = new SubmitSmsQualificationResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmsQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmsQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSmsQualificationResponse setBody(SubmitSmsQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmsQualificationResponseBody getBody() {
        return this.body;
    }

}
