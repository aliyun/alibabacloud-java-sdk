// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyElasticityAssuranceResponseBody body;

    public static ModifyElasticityAssuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticityAssuranceResponse self = new ModifyElasticityAssuranceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticityAssuranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticityAssuranceResponse setBody(ModifyElasticityAssuranceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticityAssuranceResponseBody getBody() {
        return this.body;
    }

}
