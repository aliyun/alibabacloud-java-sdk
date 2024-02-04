// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAllDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllDataSourcesResponse setBody(DescribeAllDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllDataSourcesResponseBody getBody() {
        return this.body;
    }

}
