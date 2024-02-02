// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyElasticityAssuranceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyElasticityAssuranceResponse setBody(ModifyElasticityAssuranceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticityAssuranceResponseBody getBody() {
        return this.body;
    }

}
