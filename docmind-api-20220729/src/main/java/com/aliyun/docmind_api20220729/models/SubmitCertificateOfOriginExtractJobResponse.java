// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitCertificateOfOriginExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitCertificateOfOriginExtractJobResponseBody body;

    public static SubmitCertificateOfOriginExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCertificateOfOriginExtractJobResponse self = new SubmitCertificateOfOriginExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCertificateOfOriginExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCertificateOfOriginExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCertificateOfOriginExtractJobResponse setBody(SubmitCertificateOfOriginExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCertificateOfOriginExtractJobResponseBody getBody() {
        return this.body;
    }

}
