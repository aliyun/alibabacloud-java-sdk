// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainInfoResponseBody body;

    public static DescribeBlockchainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainInfoResponse self = new DescribeBlockchainInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainInfoResponse setBody(DescribeBlockchainInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainInfoResponseBody getBody() {
        return this.body;
    }

}
