// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbDutyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdbDutyRuleResponseBody body;

    public static DescribeAdbDutyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbDutyRuleResponse self = new DescribeAdbDutyRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdbDutyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdbDutyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdbDutyRuleResponse setBody(DescribeAdbDutyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdbDutyRuleResponseBody getBody() {
        return this.body;
    }

}
