// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRequestDiagnosisIdResponseBody body;

    public static GetRequestDiagnosisIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisIdResponse self = new GetRequestDiagnosisIdResponse();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRequestDiagnosisIdResponse setBody(GetRequestDiagnosisIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRequestDiagnosisIdResponseBody getBody() {
        return this.body;
    }

}
