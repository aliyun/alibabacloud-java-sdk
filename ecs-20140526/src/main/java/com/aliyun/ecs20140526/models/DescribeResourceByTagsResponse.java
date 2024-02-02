// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourceByTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceByTagsResponseBody body;

    public static DescribeResourceByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByTagsResponse self = new DescribeResourceByTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceByTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceByTagsResponse setBody(DescribeResourceByTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceByTagsResponseBody getBody() {
        return this.body;
    }

}
