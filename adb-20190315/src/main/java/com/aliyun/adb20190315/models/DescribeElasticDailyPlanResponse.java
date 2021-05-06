// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticDailyPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeElasticDailyPlanResponse setBody(DescribeElasticDailyPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticDailyPlanResponseBody getBody() {
        return this.body;
    }

}
