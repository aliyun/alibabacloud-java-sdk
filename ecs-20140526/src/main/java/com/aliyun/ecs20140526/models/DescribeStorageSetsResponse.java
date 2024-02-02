// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStorageSetsResponseBody body;

    public static DescribeStorageSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsResponse self = new DescribeStorageSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageSetsResponse setBody(DescribeStorageSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageSetsResponseBody getBody() {
        return this.body;
    }

}
