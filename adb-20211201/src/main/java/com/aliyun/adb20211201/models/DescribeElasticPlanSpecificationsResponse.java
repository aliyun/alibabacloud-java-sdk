// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanSpecificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticPlanSpecificationsResponseBody body;

    public static DescribeElasticPlanSpecificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanSpecificationsResponse self = new DescribeElasticPlanSpecificationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanSpecificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticPlanSpecificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticPlanSpecificationsResponse setBody(DescribeElasticPlanSpecificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticPlanSpecificationsResponseBody getBody() {
        return this.body;
    }

}
