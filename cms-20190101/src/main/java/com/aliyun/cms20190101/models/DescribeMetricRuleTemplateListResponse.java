// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricRuleTemplateListResponseBody body;

    public static DescribeMetricRuleTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateListResponse self = new DescribeMetricRuleTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleTemplateListResponse setBody(DescribeMetricRuleTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleTemplateListResponseBody getBody() {
        return this.body;
    }

}
