// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllDataSourceResponseBody body;

    public static DescribeAllDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourceResponse self = new DescribeAllDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllDataSourceResponse setBody(DescribeAllDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllDataSourceResponseBody getBody() {
        return this.body;
    }

}
