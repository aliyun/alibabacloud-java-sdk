// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainRestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainRestResponseBody body;

    public static DescribeAntChainRestResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainRestResponse self = new DescribeAntChainRestResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainRestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainRestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainRestResponse setBody(DescribeAntChainRestResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainRestResponseBody getBody() {
        return this.body;
    }

}
