// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBiz30MResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRequestStatisticCountByEsnBiz30MResponseBody body;

    public static DescribeRequestStatisticCountByEsnBiz30MResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBiz30MResponse self = new DescribeRequestStatisticCountByEsnBiz30MResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBiz30MResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestStatisticCountByEsnBiz30MResponse setBody(DescribeRequestStatisticCountByEsnBiz30MResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestStatisticCountByEsnBiz30MResponseBody getBody() {
        return this.body;
    }

}
