// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainApplicationResponseBody body;

    public static DescribeBlockchainApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainApplicationResponse self = new DescribeBlockchainApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainApplicationResponse setBody(DescribeBlockchainApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainApplicationResponseBody getBody() {
        return this.body;
    }

}
