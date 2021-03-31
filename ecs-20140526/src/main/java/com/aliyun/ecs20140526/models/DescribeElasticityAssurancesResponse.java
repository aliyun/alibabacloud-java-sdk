// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeElasticityAssurancesResponse setBody(DescribeElasticityAssurancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticityAssurancesResponseBody getBody() {
        return this.body;
    }

}
