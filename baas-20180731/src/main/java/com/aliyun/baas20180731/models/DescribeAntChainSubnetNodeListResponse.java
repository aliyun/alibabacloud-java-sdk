// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainSubnetNodeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainSubnetNodeListResponseBody body;

    public static DescribeAntChainSubnetNodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainSubnetNodeListResponse self = new DescribeAntChainSubnetNodeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainSubnetNodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainSubnetNodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainSubnetNodeListResponse setBody(DescribeAntChainSubnetNodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainSubnetNodeListResponseBody getBody() {
        return this.body;
    }

}
