// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewElasticityAssurancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewElasticityAssurancesResponseBody body;

    public static RenewElasticityAssurancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewElasticityAssurancesResponse self = new RenewElasticityAssurancesResponse();
        return TeaModel.build(map, self);
    }

    public RenewElasticityAssurancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewElasticityAssurancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewElasticityAssurancesResponse setBody(RenewElasticityAssurancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewElasticityAssurancesResponseBody getBody() {
        return this.body;
    }

}
