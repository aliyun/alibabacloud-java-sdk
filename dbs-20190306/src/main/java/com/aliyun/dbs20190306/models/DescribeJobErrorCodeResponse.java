// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeJobErrorCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobErrorCodeResponseBody body;

    public static DescribeJobErrorCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobErrorCodeResponse self = new DescribeJobErrorCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobErrorCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobErrorCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobErrorCodeResponse setBody(DescribeJobErrorCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobErrorCodeResponseBody getBody() {
        return this.body;
    }

}
