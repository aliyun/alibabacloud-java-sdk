// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRequestStatisticLogResponseBody body;

    public static DescribeRequestStatisticLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticLogResponse self = new DescribeRequestStatisticLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestStatisticLogResponse setBody(DescribeRequestStatisticLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestStatisticLogResponseBody getBody() {
        return this.body;
    }

}
