// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssuranceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticityAssuranceAutoRenewAttributeResponseBody body;

    public static DescribeElasticityAssuranceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssuranceAutoRenewAttributeResponse self = new DescribeElasticityAssuranceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssuranceAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticityAssuranceAutoRenewAttributeResponse setBody(DescribeElasticityAssuranceAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticityAssuranceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
