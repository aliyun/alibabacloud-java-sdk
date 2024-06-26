// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainConfigOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainConfigOptionsResponseBody body;

    public static DescribeAntChainConfigOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConfigOptionsResponse self = new DescribeAntChainConfigOptionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConfigOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainConfigOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainConfigOptionsResponse setBody(DescribeAntChainConfigOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainConfigOptionsResponseBody getBody() {
        return this.body;
    }

}
