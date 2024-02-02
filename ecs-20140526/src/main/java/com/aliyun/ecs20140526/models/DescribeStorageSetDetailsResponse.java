// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeStorageSetDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageSetDetailsResponse setBody(DescribeStorageSetDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageSetDetailsResponseBody getBody() {
        return this.body;
    }

}
