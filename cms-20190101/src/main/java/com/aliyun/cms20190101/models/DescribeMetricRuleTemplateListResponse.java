// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMetricRuleTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricRuleTemplateListResponse setBody(DescribeMetricRuleTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricRuleTemplateListResponseBody getBody() {
        return this.body;
    }

}
