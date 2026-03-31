// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataSourcesResponseBody body;

    public static DescribeDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcesResponse self = new DescribeDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSourcesResponse setBody(DescribeDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourcesResponseBody getBody() {
        return this.body;
    }

}
