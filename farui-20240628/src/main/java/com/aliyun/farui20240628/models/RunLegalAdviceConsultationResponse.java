// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunLegalAdviceConsultationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunLegalAdviceConsultationResponseBody body;

    public static RunLegalAdviceConsultationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunLegalAdviceConsultationResponse self = new RunLegalAdviceConsultationResponse();
        return TeaModel.build(map, self);
    }

    public RunLegalAdviceConsultationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunLegalAdviceConsultationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunLegalAdviceConsultationResponse setBody(RunLegalAdviceConsultationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunLegalAdviceConsultationResponseBody getBody() {
        return this.body;
    }

}
