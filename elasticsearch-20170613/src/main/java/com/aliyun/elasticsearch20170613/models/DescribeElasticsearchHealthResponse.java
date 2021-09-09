// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeElasticsearchHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeElasticsearchHealthResponseBody body;

    public static DescribeElasticsearchHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticsearchHealthResponse self = new DescribeElasticsearchHealthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticsearchHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticsearchHealthResponse setBody(DescribeElasticsearchHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticsearchHealthResponseBody getBody() {
        return this.body;
    }

}
