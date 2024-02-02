// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticityAssuranceInstancesResponseBody body;

    public static DescribeElasticityAssuranceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceInstancesResponse self = new DescribeElasticityAssuranceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticityAssuranceInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticityAssuranceInstancesResponse setBody(DescribeElasticityAssuranceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticityAssuranceInstancesResponseBody getBody() {
        return this.body;
    }

}
