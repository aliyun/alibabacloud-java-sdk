// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseElasticityAssuranceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseElasticityAssuranceResponseBody body;

    public static PurchaseElasticityAssuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseElasticityAssuranceResponse self = new PurchaseElasticityAssuranceResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseElasticityAssuranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurchaseElasticityAssuranceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurchaseElasticityAssuranceResponse setBody(PurchaseElasticityAssuranceResponseBody body) {
        this.body = body;
        return this;
    }
    public PurchaseElasticityAssuranceResponseBody getBody() {
        return this.body;
    }

}
