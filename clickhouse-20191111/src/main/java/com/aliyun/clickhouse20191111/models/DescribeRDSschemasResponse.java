// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRDSschemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRDSschemasResponseBody body;

    public static DescribeRDSschemasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSschemasResponse self = new DescribeRDSschemasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRDSschemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRDSschemasResponse setBody(DescribeRDSschemasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRDSschemasResponseBody getBody() {
        return this.body;
    }

}
