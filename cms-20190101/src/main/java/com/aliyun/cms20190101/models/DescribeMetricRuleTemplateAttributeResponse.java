// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricRuleTemplateAttributeResponseBody body;

    public static DescribeMetricRuleTemplateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateAttributeResponse self = new DescribeMetricRuleTemplateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricRuleTemplateAttributeResponse setBody(DescribeMetricRuleTemplateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleTemplateAttributeResponseBody getBody() {
        return this.body;
    }

}
