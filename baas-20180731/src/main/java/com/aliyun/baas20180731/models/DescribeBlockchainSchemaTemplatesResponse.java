// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainSchemaTemplatesResponseBody body;

    public static DescribeBlockchainSchemaTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaTemplatesResponse self = new DescribeBlockchainSchemaTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainSchemaTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainSchemaTemplatesResponse setBody(DescribeBlockchainSchemaTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainSchemaTemplatesResponseBody getBody() {
        return this.body;
    }

}
