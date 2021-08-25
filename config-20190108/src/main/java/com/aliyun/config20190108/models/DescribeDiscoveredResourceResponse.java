// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDiscoveredResourceResponseBody body;

    public static DescribeDiscoveredResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiscoveredResourceResponse self = new DescribeDiscoveredResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiscoveredResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiscoveredResourceResponse setBody(DescribeDiscoveredResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiscoveredResourceResponseBody getBody() {
        return this.body;
    }

}
