// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeVpcsForMongoDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcsForMongoDBResponseBody body;

    public static DescribeVpcsForMongoDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsForMongoDBResponse self = new DescribeVpcsForMongoDBResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsForMongoDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcsForMongoDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcsForMongoDBResponse setBody(DescribeVpcsForMongoDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcsForMongoDBResponseBody getBody() {
        return this.body;
    }

}
