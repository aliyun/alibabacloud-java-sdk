// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PetHealthAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PetHealthAnalysisResponseBody body;

    public static PetHealthAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        PetHealthAnalysisResponse self = new PetHealthAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public PetHealthAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PetHealthAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PetHealthAnalysisResponse setBody(PetHealthAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public PetHealthAnalysisResponseBody getBody() {
        return this.body;
    }

}
