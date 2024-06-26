// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEthereumsResponseBody body;

    public static DescribeEthereumsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumsResponse self = new DescribeEthereumsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEthereumsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEthereumsResponse setBody(DescribeEthereumsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEthereumsResponseBody getBody() {
        return this.body;
    }

}
