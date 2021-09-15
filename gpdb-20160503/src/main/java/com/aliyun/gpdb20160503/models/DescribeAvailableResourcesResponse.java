// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableResourcesResponseBody body;

    public static DescribeAvailableResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourcesResponse self = new DescribeAvailableResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableResourcesResponse setBody(DescribeAvailableResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableResourcesResponseBody getBody() {
        return this.body;
    }

}
