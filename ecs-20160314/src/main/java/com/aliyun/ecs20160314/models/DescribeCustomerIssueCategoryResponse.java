// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeCustomerIssueCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomerIssueCategoryResponseBody body;

    public static DescribeCustomerIssueCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerIssueCategoryResponse self = new DescribeCustomerIssueCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerIssueCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomerIssueCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomerIssueCategoryResponse setBody(DescribeCustomerIssueCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomerIssueCategoryResponseBody getBody() {
        return this.body;
    }

}
