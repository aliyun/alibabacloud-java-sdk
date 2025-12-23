// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIdResponseBody body;

    public static DescribeIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdResponse self = new DescribeIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIdResponse setBody(DescribeIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIdResponseBody getBody() {
        return this.body;
    }

}
