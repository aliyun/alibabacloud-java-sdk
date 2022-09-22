// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservedInstanceCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReservedInstanceCategoriesResponseBody body;

    public static DescribeReservedInstanceCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstanceCategoriesResponse self = new DescribeReservedInstanceCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstanceCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReservedInstanceCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReservedInstanceCategoriesResponse setBody(DescribeReservedInstanceCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReservedInstanceCategoriesResponseBody getBody() {
        return this.body;
    }

}
