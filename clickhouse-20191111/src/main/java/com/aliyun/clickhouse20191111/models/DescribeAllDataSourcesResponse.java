// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllDataSourcesResponseBody body;

    public static DescribeAllDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourcesResponse self = new DescribeAllDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllDataSourcesResponse setBody(DescribeAllDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllDataSourcesResponseBody getBody() {
        return this.body;
    }

}
