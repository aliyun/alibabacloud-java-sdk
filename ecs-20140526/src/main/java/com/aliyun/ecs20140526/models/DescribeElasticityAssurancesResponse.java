// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticityAssurancesResponseBody body;

    public static DescribeElasticityAssurancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssurancesResponse self = new DescribeElasticityAssurancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssurancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticityAssurancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticityAssurancesResponse setBody(DescribeElasticityAssurancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticityAssurancesResponseBody getBody() {
        return this.body;
    }

}
