// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserTagsResponseBody body;

    public static DescribeUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagsResponse self = new DescribeUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserTagsResponse setBody(DescribeUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserTagsResponseBody getBody() {
        return this.body;
    }

}
