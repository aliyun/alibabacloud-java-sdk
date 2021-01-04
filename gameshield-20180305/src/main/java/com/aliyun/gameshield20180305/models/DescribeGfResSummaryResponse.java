// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeGfResSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGfResSummaryResponseBody body;

    public static DescribeGfResSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGfResSummaryResponse self = new DescribeGfResSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGfResSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGfResSummaryResponse setBody(DescribeGfResSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGfResSummaryResponseBody getBody() {
        return this.body;
    }

}
