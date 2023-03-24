// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeElasticPlanJobsResponseBody body;

    public static DescribeElasticPlanJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanJobsResponse self = new DescribeElasticPlanJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticPlanJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticPlanJobsResponse setBody(DescribeElasticPlanJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticPlanJobsResponseBody getBody() {
        return this.body;
    }

}
