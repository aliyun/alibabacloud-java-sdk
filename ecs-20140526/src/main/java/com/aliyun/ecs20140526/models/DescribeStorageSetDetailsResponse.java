// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStorageSetDetailsResponseBody body;

    public static DescribeStorageSetDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetDetailsResponse self = new DescribeStorageSetDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageSetDetailsResponse setBody(DescribeStorageSetDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageSetDetailsResponseBody getBody() {
        return this.body;
    }

}
