// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMetricRuleTemplateAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricRuleTemplateAttributeResponse setBody(DescribeMetricRuleTemplateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleTemplateAttributeResponseBody getBody() {
        return this.body;
    }

}
