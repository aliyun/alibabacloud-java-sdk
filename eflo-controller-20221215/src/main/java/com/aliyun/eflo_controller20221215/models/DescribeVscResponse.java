// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeVscResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVscResponseBody body;

    public static DescribeVscResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscResponse self = new DescribeVscResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVscResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVscResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVscResponse setBody(DescribeVscResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVscResponseBody getBody() {
        return this.body;
    }

}
