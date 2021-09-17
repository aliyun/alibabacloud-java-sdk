// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DescribeInstanceSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceSaleResponseBody body;

    public static DescribeInstanceSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSaleResponse self = new DescribeInstanceSaleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSaleResponse setBody(DescribeInstanceSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSaleResponseBody getBody() {
        return this.body;
    }

}
