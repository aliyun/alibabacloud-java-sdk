// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeAccountSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountSummaryResponseBody body;

    public static DescribeAccountSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountSummaryResponse self = new DescribeAccountSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountSummaryResponse setBody(DescribeAccountSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountSummaryResponseBody getBody() {
        return this.body;
    }

}
