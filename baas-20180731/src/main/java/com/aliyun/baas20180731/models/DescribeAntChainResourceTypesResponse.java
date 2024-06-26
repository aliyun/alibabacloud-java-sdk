// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainResourceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainResourceTypesResponseBody body;

    public static DescribeAntChainResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainResourceTypesResponse self = new DescribeAntChainResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainResourceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainResourceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainResourceTypesResponse setBody(DescribeAntChainResourceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainResourceTypesResponseBody getBody() {
        return this.body;
    }

}
