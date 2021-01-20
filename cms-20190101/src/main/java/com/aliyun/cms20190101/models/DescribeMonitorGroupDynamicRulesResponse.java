// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupDynamicRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMonitorGroupDynamicRulesResponse setBody(DescribeMonitorGroupDynamicRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupDynamicRulesResponseBody getBody() {
        return this.body;
    }

}
