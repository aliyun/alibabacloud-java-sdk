// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ResetQualificationVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetQualificationVerificationResponseBody body;

    public static ResetQualificationVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetQualificationVerificationResponse self = new ResetQualificationVerificationResponse();
        return TeaModel.build(map, self);
    }

    public ResetQualificationVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetQualificationVerificationResponse setBody(ResetQualificationVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetQualificationVerificationResponseBody getBody() {
        return this.body;
    }

}
