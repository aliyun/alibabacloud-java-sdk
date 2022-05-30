// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSpecificationResponseBody body;

    public static DescribeSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpecificationResponse self = new DescribeSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpecificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSpecificationResponse setBody(DescribeSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpecificationResponseBody getBody() {
        return this.body;
    }

}
