// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupDynamicRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorGroupDynamicRulesResponseBody body;

    public static DescribeMonitorGroupDynamicRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupDynamicRulesResponse self = new DescribeMonitorGroupDynamicRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupDynamicRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorGroupDynamicRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorGroupDynamicRulesResponse setBody(DescribeMonitorGroupDynamicRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupDynamicRulesResponseBody getBody() {
        return this.body;
    }

}
