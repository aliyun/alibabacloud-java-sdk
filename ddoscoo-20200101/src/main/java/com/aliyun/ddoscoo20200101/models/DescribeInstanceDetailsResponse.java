// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceDetailsResponseBody body;

    public static DescribeInstanceDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDetailsResponse self = new DescribeInstanceDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDetailsResponse setBody(DescribeInstanceDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDetailsResponseBody getBody() {
        return this.body;
    }

}
