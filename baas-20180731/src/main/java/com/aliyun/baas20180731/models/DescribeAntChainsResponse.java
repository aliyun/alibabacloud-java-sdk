// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainsResponseBody body;

    public static DescribeAntChainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainsResponse self = new DescribeAntChainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainsResponse setBody(DescribeAntChainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainsResponseBody getBody() {
        return this.body;
    }

}
