// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceSolutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceSolutionsResponseBody body;

    public static DescribeResourceSolutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceSolutionsResponse self = new DescribeResourceSolutionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceSolutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceSolutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceSolutionsResponse setBody(DescribeResourceSolutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceSolutionsResponseBody getBody() {
        return this.body;
    }

}
