// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEventRuleAttributeResponseBody body;

    public static DescribeEventRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleAttributeResponse self = new DescribeEventRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventRuleAttributeResponse setBody(DescribeEventRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
