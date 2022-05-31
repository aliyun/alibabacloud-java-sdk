// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDetectVideoLabelsResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectVideoLabelsResultResponseBody body;

    public static GetDetectVideoLabelsResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectVideoLabelsResultResponse self = new GetDetectVideoLabelsResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectVideoLabelsResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectVideoLabelsResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectVideoLabelsResultResponse setBody(GetDetectVideoLabelsResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectVideoLabelsResultResponseBody getBody() {
        return this.body;
    }

}
