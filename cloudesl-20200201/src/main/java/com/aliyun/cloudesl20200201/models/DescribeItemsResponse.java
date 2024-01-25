// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeItemsResponseBody body;

    public static DescribeItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeItemsResponse self = new DescribeItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeItemsResponse setBody(DescribeItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeItemsResponseBody getBody() {
        return this.body;
    }

}
