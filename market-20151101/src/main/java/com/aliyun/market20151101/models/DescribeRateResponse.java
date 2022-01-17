// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeRateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRateResponseBody body;

    public static DescribeRateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRateResponse self = new DescribeRateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRateResponse setBody(DescribeRateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRateResponseBody getBody() {
        return this.body;
    }

}
