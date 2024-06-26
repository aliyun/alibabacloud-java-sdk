// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainConsortiumsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainConsortiumsNewResponseBody body;

    public static DescribeAntChainConsortiumsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConsortiumsNewResponse self = new DescribeAntChainConsortiumsNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConsortiumsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainConsortiumsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainConsortiumsNewResponse setBody(DescribeAntChainConsortiumsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainConsortiumsNewResponseBody getBody() {
        return this.body;
    }

}
