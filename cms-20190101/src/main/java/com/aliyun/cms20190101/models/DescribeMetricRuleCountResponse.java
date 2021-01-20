// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricRuleCountResponseBody body;

    public static DescribeMetricRuleCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountResponse self = new DescribeMetricRuleCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleCountResponse setBody(DescribeMetricRuleCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleCountResponseBody getBody() {
        return this.body;
    }

}
