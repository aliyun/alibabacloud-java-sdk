// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeExcpetionCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExcpetionCountResponseBody body;

    public static DescribeExcpetionCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcpetionCountResponse self = new DescribeExcpetionCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExcpetionCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExcpetionCountResponse setBody(DescribeExcpetionCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExcpetionCountResponseBody getBody() {
        return this.body;
    }

}
