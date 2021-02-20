// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCacheConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebCacheConfigsResponseBody body;

    public static DescribeWebCacheConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCacheConfigsResponse self = new DescribeWebCacheConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebCacheConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCacheConfigsResponse setBody(DescribeWebCacheConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCacheConfigsResponseBody getBody() {
        return this.body;
    }

}
