// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertingMetricRuleResourcesResponseBody body;

    public static DescribeAlertingMetricRuleResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesResponse self = new DescribeAlertingMetricRuleResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertingMetricRuleResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertingMetricRuleResourcesResponse setBody(DescribeAlertingMetricRuleResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertingMetricRuleResourcesResponseBody getBody() {
        return this.body;
    }

}
