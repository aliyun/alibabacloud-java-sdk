// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeMongoDBLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMongoDBLogConfigResponse setBody(DescribeMongoDBLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMongoDBLogConfigResponseBody getBody() {
        return this.body;
    }

}
