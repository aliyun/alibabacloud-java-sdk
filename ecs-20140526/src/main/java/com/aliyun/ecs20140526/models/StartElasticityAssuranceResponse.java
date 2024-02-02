// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartElasticityAssuranceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartElasticityAssuranceResponseBody body;

    public static StartElasticityAssuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartElasticityAssuranceResponse self = new StartElasticityAssuranceResponse();
        return TeaModel.build(map, self);
    }

    public StartElasticityAssuranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartElasticityAssuranceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartElasticityAssuranceResponse setBody(StartElasticityAssuranceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartElasticityAssuranceResponseBody getBody() {
        return this.body;
    }

}
