// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHanaDatabasesResponseBody body;

    public static DescribeHanaDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaDatabasesResponse self = new DescribeHanaDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHanaDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHanaDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHanaDatabasesResponse setBody(DescribeHanaDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHanaDatabasesResponseBody getBody() {
        return this.body;
    }

}
