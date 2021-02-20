// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSchedulerRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSchedulerRulesResponseBody body;

    public static DescribeSchedulerRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchedulerRulesResponse self = new DescribeSchedulerRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSchedulerRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSchedulerRulesResponse setBody(DescribeSchedulerRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSchedulerRulesResponseBody getBody() {
        return this.body;
    }

}
