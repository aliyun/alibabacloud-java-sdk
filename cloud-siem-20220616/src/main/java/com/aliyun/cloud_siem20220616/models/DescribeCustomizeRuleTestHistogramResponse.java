// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleTestHistogramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomizeRuleTestHistogramResponseBody body;

    public static DescribeCustomizeRuleTestHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleTestHistogramResponse self = new DescribeCustomizeRuleTestHistogramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleTestHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizeRuleTestHistogramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizeRuleTestHistogramResponse setBody(DescribeCustomizeRuleTestHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizeRuleTestHistogramResponseBody getBody() {
        return this.body;
    }

}
