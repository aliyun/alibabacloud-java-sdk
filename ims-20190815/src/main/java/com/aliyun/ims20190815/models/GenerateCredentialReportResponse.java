// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateCredentialReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCredentialReportResponseBody body;

    public static GenerateCredentialReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCredentialReportResponse self = new GenerateCredentialReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCredentialReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCredentialReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCredentialReportResponse setBody(GenerateCredentialReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCredentialReportResponseBody getBody() {
        return this.body;
    }

}
