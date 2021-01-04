// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAccResSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccResSummaryResponseBody body;

    public static DescribeAccResSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccResSummaryResponse self = new DescribeAccResSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccResSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccResSummaryResponse setBody(DescribeAccResSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccResSummaryResponseBody getBody() {
        return this.body;
    }

}
