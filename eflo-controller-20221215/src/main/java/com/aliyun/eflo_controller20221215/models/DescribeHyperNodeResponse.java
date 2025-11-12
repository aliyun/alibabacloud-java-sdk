// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeHyperNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHyperNodeResponseBody body;

    public static DescribeHyperNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHyperNodeResponse self = new DescribeHyperNodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHyperNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHyperNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHyperNodeResponse setBody(DescribeHyperNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHyperNodeResponseBody getBody() {
        return this.body;
    }

}
