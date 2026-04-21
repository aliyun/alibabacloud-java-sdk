// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MedicalAnswerResult body;

    public static MedicalAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        MedicalAnswerResponse self = new MedicalAnswerResponse();
        return TeaModel.build(map, self);
    }

    public MedicalAnswerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MedicalAnswerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MedicalAnswerResponse setBody(MedicalAnswerResult body) {
        this.body = body;
        return this;
    }
    public MedicalAnswerResult getBody() {
        return this.body;
    }

}
