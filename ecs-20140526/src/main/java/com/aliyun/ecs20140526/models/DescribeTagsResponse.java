// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagsResponseBody body;

    public static DescribeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponse self = new DescribeTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagsResponse setBody(DescribeTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagsResponseBody getBody() {
        return this.body;
    }

}
