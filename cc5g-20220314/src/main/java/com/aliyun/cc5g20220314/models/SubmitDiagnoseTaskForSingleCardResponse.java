// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SubmitDiagnoseTaskForSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDiagnoseTaskForSingleCardResponseBody body;

    public static SubmitDiagnoseTaskForSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDiagnoseTaskForSingleCardResponse self = new SubmitDiagnoseTaskForSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDiagnoseTaskForSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDiagnoseTaskForSingleCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDiagnoseTaskForSingleCardResponse setBody(SubmitDiagnoseTaskForSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDiagnoseTaskForSingleCardResponseBody getBody() {
        return this.body;
    }

}
