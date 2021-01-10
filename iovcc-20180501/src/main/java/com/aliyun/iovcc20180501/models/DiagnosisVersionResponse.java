// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DiagnosisVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DiagnosisVersionResponseBody body;

    public static DiagnosisVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DiagnosisVersionResponse self = new DiagnosisVersionResponse();
        return TeaModel.build(map, self);
    }

    public DiagnosisVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiagnosisVersionResponse setBody(DiagnosisVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DiagnosisVersionResponseBody getBody() {
        return this.body;
    }

}
