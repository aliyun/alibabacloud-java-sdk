// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitQualificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitQualificationResponseBody body;

    public static SubmitQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualificationResponse self = new SubmitQualificationResponse();
        return TeaModel.build(map, self);
    }

    public SubmitQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitQualificationResponse setBody(SubmitQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitQualificationResponseBody getBody() {
        return this.body;
    }

}
