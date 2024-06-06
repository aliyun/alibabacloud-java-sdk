// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterDiagnosisResultResponseBody body;

    public static GetClusterDiagnosisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDiagnosisResultResponse self = new GetClusterDiagnosisResultResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterDiagnosisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterDiagnosisResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterDiagnosisResultResponse setBody(GetClusterDiagnosisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterDiagnosisResultResponseBody getBody() {
        return this.body;
    }

}
