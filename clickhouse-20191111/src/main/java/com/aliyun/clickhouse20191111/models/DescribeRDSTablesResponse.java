// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRDSTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRDSTablesResponseBody body;

    public static DescribeRDSTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSTablesResponse self = new DescribeRDSTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRDSTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRDSTablesResponse setBody(DescribeRDSTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRDSTablesResponseBody getBody() {
        return this.body;
    }

}
