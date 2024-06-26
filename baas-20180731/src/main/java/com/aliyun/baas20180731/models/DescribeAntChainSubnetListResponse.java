// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainSubnetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainSubnetListResponseBody body;

    public static DescribeAntChainSubnetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainSubnetListResponse self = new DescribeAntChainSubnetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainSubnetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainSubnetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainSubnetListResponse setBody(DescribeAntChainSubnetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainSubnetListResponseBody getBody() {
        return this.body;
    }

}
