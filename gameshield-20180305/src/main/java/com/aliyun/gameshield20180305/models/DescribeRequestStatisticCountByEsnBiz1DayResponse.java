// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBiz1DayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRequestStatisticCountByEsnBiz1DayResponseBody body;

    public static DescribeRequestStatisticCountByEsnBiz1DayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBiz1DayResponse self = new DescribeRequestStatisticCountByEsnBiz1DayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBiz1DayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestStatisticCountByEsnBiz1DayResponse setBody(DescribeRequestStatisticCountByEsnBiz1DayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestStatisticCountByEsnBiz1DayResponseBody getBody() {
        return this.body;
    }

}
