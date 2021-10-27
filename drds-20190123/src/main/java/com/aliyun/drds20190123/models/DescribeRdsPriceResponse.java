// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsPriceResponseBody body;

    public static DescribeRdsPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsPriceResponse self = new DescribeRdsPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsPriceResponse setBody(DescribeRdsPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsPriceResponseBody getBody() {
        return this.body;
    }

}
