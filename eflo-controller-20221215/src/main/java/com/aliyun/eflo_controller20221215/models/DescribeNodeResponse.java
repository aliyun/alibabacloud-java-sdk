// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNodeResponseBody body;

    public static DescribeNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeResponse self = new DescribeNodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeResponse setBody(DescribeNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeResponseBody getBody() {
        return this.body;
    }

}
