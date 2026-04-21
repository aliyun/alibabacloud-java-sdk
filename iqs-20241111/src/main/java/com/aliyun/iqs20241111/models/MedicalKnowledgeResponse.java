// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MedicalKnowResult body;

    public static MedicalKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        MedicalKnowledgeResponse self = new MedicalKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public MedicalKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MedicalKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MedicalKnowledgeResponse setBody(MedicalKnowResult body) {
        this.body = body;
        return this;
    }
    public MedicalKnowResult getBody() {
        return this.body;
    }

}
