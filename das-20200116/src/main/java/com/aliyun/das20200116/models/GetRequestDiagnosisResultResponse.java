// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRequestDiagnosisResultResponseBody body;

    public static GetRequestDiagnosisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisResultResponse self = new GetRequestDiagnosisResultResponse();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRequestDiagnosisResultResponse setBody(GetRequestDiagnosisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRequestDiagnosisResultResponseBody getBody() {
        return this.body;
    }

}
