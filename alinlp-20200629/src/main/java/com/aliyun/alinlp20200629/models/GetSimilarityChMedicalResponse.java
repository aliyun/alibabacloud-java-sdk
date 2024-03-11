// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSimilarityChMedicalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSimilarityChMedicalResponseBody body;

    public static GetSimilarityChMedicalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarityChMedicalResponse self = new GetSimilarityChMedicalResponse();
        return TeaModel.build(map, self);
    }

    public GetSimilarityChMedicalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSimilarityChMedicalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSimilarityChMedicalResponse setBody(GetSimilarityChMedicalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSimilarityChMedicalResponseBody getBody() {
        return this.body;
    }

}
