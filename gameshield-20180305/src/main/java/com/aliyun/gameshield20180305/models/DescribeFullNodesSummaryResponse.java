// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFullNodesSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFullNodesSummaryResponseBody body;

    public static DescribeFullNodesSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullNodesSummaryResponse self = new DescribeFullNodesSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFullNodesSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFullNodesSummaryResponse setBody(DescribeFullNodesSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFullNodesSummaryResponseBody getBody() {
        return this.body;
    }

}
