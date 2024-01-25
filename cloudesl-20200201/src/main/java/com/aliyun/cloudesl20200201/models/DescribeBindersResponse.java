// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeBindersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBindersResponseBody body;

    public static DescribeBindersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindersResponse self = new DescribeBindersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBindersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBindersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBindersResponse setBody(DescribeBindersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBindersResponseBody getBody() {
        return this.body;
    }

}
