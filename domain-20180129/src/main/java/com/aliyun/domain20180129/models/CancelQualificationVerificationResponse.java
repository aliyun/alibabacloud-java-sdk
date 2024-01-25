// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelQualificationVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelQualificationVerificationResponseBody body;

    public static CancelQualificationVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelQualificationVerificationResponse self = new CancelQualificationVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CancelQualificationVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelQualificationVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelQualificationVerificationResponse setBody(CancelQualificationVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelQualificationVerificationResponseBody getBody() {
        return this.body;
    }

}
