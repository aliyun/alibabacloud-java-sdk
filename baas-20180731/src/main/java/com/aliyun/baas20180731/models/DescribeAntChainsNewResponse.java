// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainsNewResponseBody body;

    public static DescribeAntChainsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainsNewResponse self = new DescribeAntChainsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainsNewResponse setBody(DescribeAntChainsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainsNewResponseBody getBody() {
        return this.body;
    }

}
