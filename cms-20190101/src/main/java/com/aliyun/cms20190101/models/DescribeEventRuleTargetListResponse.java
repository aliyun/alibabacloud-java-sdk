// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleTargetListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEventRuleTargetListResponseBody body;

    public static DescribeEventRuleTargetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleTargetListResponse self = new DescribeEventRuleTargetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleTargetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventRuleTargetListResponse setBody(DescribeEventRuleTargetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventRuleTargetListResponseBody getBody() {
        return this.body;
    }

}
