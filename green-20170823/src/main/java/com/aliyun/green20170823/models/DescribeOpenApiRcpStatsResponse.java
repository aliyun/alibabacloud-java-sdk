// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOpenApiRcpStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenApiRcpStatsResponseBody body;

    public static DescribeOpenApiRcpStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiRcpStatsResponse self = new DescribeOpenApiRcpStatsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiRcpStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenApiRcpStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenApiRcpStatsResponse setBody(DescribeOpenApiRcpStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenApiRcpStatsResponseBody getBody() {
        return this.body;
    }

}
