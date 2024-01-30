// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeMongoDBLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMongoDBLogConfigResponseBody body;

    public static DescribeMongoDBLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMongoDBLogConfigResponse self = new DescribeMongoDBLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMongoDBLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMongoDBLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMongoDBLogConfigResponse setBody(DescribeMongoDBLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMongoDBLogConfigResponseBody getBody() {
        return this.body;
    }

}
