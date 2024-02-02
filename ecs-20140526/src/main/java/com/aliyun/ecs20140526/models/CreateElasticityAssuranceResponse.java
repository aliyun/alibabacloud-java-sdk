// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateElasticityAssuranceResponseBody body;

    public static CreateElasticityAssuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticityAssuranceResponse self = new CreateElasticityAssuranceResponse();
        return TeaModel.build(map, self);
    }

    public CreateElasticityAssuranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateElasticityAssuranceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateElasticityAssuranceResponse setBody(CreateElasticityAssuranceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateElasticityAssuranceResponseBody getBody() {
        return this.body;
    }

}
