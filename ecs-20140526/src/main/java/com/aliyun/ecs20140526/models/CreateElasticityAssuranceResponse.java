// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateElasticityAssuranceResponse setBody(CreateElasticityAssuranceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateElasticityAssuranceResponseBody getBody() {
        return this.body;
    }

}
