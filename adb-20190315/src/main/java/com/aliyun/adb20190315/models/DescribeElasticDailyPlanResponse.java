// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticDailyPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeElasticDailyPlanResponseBody body;

    public static DescribeElasticDailyPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticDailyPlanResponse self = new DescribeElasticDailyPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticDailyPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticDailyPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeElasticDailyPlanResponse setBody(DescribeElasticDailyPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticDailyPlanResponseBody getBody() {
        return this.body;
    }

}
