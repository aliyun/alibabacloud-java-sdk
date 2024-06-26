// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainSchemaDetailResponseBody body;

    public static DescribeBlockchainSchemaDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaDetailResponse self = new DescribeBlockchainSchemaDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainSchemaDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainSchemaDetailResponse setBody(DescribeBlockchainSchemaDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainSchemaDetailResponseBody getBody() {
        return this.body;
    }

}
