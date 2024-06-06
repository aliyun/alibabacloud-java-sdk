// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleDiagnoseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTitleDiagnoseResponseBody body;

    public static GetTitleDiagnoseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTitleDiagnoseResponse self = new GetTitleDiagnoseResponse();
        return TeaModel.build(map, self);
    }

    public GetTitleDiagnoseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTitleDiagnoseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTitleDiagnoseResponse setBody(GetTitleDiagnoseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTitleDiagnoseResponseBody getBody() {
        return this.body;
    }

}
