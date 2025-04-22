// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ChangeSignatureQualificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeSignatureQualificationResponseBody body;

    public static ChangeSignatureQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeSignatureQualificationResponse self = new ChangeSignatureQualificationResponse();
        return TeaModel.build(map, self);
    }

    public ChangeSignatureQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeSignatureQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeSignatureQualificationResponse setBody(ChangeSignatureQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeSignatureQualificationResponseBody getBody() {
        return this.body;
    }

}
