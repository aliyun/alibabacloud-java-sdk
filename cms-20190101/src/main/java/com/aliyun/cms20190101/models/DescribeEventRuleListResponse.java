// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEventRuleListResponseBody body;

    public static DescribeEventRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleListResponse self = new DescribeEventRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventRuleListResponse setBody(DescribeEventRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventRuleListResponseBody getBody() {
        return this.body;
    }

}
