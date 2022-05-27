// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSkinDiseaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectSkinDiseaseResponseBody body;

    public static DetectSkinDiseaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectSkinDiseaseResponse self = new DetectSkinDiseaseResponse();
        return TeaModel.build(map, self);
    }

    public DetectSkinDiseaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectSkinDiseaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectSkinDiseaseResponse setBody(DetectSkinDiseaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectSkinDiseaseResponseBody getBody() {
        return this.body;
    }

}
