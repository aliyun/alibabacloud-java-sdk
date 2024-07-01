// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticPlanAttributeResponseBody body;

    public static DescribeElasticPlanAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanAttributeResponse self = new DescribeElasticPlanAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticPlanAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticPlanAttributeResponse setBody(DescribeElasticPlanAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticPlanAttributeResponseBody getBody() {
        return this.body;
    }

}
