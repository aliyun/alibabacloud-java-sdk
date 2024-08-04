// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTableResponseBody body;

    public static DescribeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableResponse self = new DescribeTableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTableResponse setBody(DescribeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableResponseBody getBody() {
        return this.body;
    }

}
