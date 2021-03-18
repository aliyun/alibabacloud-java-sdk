// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeElasticityAssuranceInstancesResponse setBody(DescribeElasticityAssuranceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticityAssuranceInstancesResponseBody getBody() {
        return this.body;
    }

}
