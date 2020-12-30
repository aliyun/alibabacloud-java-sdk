// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelQualificationVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CancelQualificationVerificationResponse setBody(CancelQualificationVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelQualificationVerificationResponseBody getBody() {
        return this.body;
    }

}
