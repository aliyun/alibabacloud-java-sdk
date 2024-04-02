// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOpenApiUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenApiUsageResponseBody body;

    public static DescribeOpenApiUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiUsageResponse self = new DescribeOpenApiUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenApiUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenApiUsageResponse setBody(DescribeOpenApiUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenApiUsageResponseBody getBody() {
        return this.body;
    }

}
