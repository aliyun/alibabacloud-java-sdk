// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeEventRuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventRuleAttributeResponse setBody(DescribeEventRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
