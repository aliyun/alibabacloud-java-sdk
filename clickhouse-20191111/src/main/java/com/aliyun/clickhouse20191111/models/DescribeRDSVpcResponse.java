// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRDSVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRDSVpcResponseBody body;

    public static DescribeRDSVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSVpcResponse self = new DescribeRDSVpcResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRDSVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRDSVpcResponse setBody(DescribeRDSVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRDSVpcResponseBody getBody() {
        return this.body;
    }

}
