// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRequestDiagnosisPageResponseBody body;

    public static GetRequestDiagnosisPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisPageResponse self = new GetRequestDiagnosisPageResponse();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRequestDiagnosisPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRequestDiagnosisPageResponse setBody(GetRequestDiagnosisPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRequestDiagnosisPageResponseBody getBody() {
        return this.body;
    }

}
