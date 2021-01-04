// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticByEsnBizIntervalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRequestStatisticByEsnBizIntervalResponseBody body;

    public static DescribeRequestStatisticByEsnBizIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticByEsnBizIntervalResponse self = new DescribeRequestStatisticByEsnBizIntervalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticByEsnBizIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestStatisticByEsnBizIntervalResponse setBody(DescribeRequestStatisticByEsnBizIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestStatisticByEsnBizIntervalResponseBody getBody() {
        return this.body;
    }

}
