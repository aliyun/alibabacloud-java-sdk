// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastServerRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAnycastServerRegionsResponseBody body;

    public static DescribeAnycastServerRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastServerRegionsResponse self = new DescribeAnycastServerRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastServerRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnycastServerRegionsResponse setBody(DescribeAnycastServerRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnycastServerRegionsResponseBody getBody() {
        return this.body;
    }

}
