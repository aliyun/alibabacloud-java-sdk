// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricRuleListResponseBody body;

    public static DescribeMetricRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListResponse self = new DescribeMetricRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleListResponse setBody(DescribeMetricRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleListResponseBody getBody() {
        return this.body;
    }

}
