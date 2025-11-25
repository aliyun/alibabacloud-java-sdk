// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAttackAppCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttackAppCategoryResponseBody body;

    public static DescribeAttackAppCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAppCategoryResponse self = new DescribeAttackAppCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAppCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackAppCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttackAppCategoryResponse setBody(DescribeAttackAppCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackAppCategoryResponseBody getBody() {
        return this.body;
    }

}
