// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeTrailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrailsResponseBody body;

    public static DescribeTrailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrailsResponse self = new DescribeTrailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrailsResponse setBody(DescribeTrailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrailsResponseBody getBody() {
        return this.body;
    }

}
