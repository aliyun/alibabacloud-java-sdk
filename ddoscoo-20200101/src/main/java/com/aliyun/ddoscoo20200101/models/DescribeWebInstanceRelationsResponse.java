// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebInstanceRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebInstanceRelationsResponseBody body;

    public static DescribeWebInstanceRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebInstanceRelationsResponse self = new DescribeWebInstanceRelationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebInstanceRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebInstanceRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebInstanceRelationsResponse setBody(DescribeWebInstanceRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebInstanceRelationsResponseBody getBody() {
        return this.body;
    }

}
