// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaFileOSSPropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainSchemaFileOSSPropertiesResponseBody body;

    public static DescribeBlockchainSchemaFileOSSPropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaFileOSSPropertiesResponse self = new DescribeBlockchainSchemaFileOSSPropertiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaFileOSSPropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainSchemaFileOSSPropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainSchemaFileOSSPropertiesResponse setBody(DescribeBlockchainSchemaFileOSSPropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainSchemaFileOSSPropertiesResponseBody getBody() {
        return this.body;
    }

}
