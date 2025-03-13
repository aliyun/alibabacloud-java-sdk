// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyElasticityAssuranceAutoRenewAttributeResponseBody body;

    public static ModifyElasticityAssuranceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticityAssuranceAutoRenewAttributeResponse self = new ModifyElasticityAssuranceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticityAssuranceAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyElasticityAssuranceAutoRenewAttributeResponse setBody(ModifyElasticityAssuranceAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticityAssuranceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
