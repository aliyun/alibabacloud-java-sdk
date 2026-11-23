// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class VerifyActivityAdmissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyActivityAdmissionResponseBody body;

    public static VerifyActivityAdmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyActivityAdmissionResponse self = new VerifyActivityAdmissionResponse();
        return TeaModel.build(map, self);
    }

    public VerifyActivityAdmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyActivityAdmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyActivityAdmissionResponse setBody(VerifyActivityAdmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyActivityAdmissionResponseBody getBody() {
        return this.body;
    }

}
