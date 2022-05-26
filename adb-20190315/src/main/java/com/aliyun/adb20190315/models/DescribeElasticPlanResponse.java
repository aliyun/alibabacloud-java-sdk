// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeElasticPlanResponseBody body;

    public static DescribeElasticPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanResponse self = new DescribeElasticPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticPlanResponse setBody(DescribeElasticPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticPlanResponseBody getBody() {
        return this.body;
    }

}
