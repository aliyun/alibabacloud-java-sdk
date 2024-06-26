// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainBlockNewResponseBody body;

    public static DescribeAntChainBlockNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainBlockNewResponse self = new DescribeAntChainBlockNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainBlockNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainBlockNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainBlockNewResponse setBody(DescribeAntChainBlockNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainBlockNewResponseBody getBody() {
        return this.body;
    }

}
