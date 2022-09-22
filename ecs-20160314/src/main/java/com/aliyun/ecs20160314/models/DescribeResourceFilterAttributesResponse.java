// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceFilterAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceFilterAttributesResponseBody body;

    public static DescribeResourceFilterAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceFilterAttributesResponse self = new DescribeResourceFilterAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceFilterAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceFilterAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceFilterAttributesResponse setBody(DescribeResourceFilterAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceFilterAttributesResponseBody getBody() {
        return this.body;
    }

}
