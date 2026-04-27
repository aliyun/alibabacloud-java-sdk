// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeUserTrailCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserTrailCountResponseBody body;

    public static DescribeUserTrailCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTrailCountResponse self = new DescribeUserTrailCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserTrailCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserTrailCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserTrailCountResponse setBody(DescribeUserTrailCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserTrailCountResponseBody getBody() {
        return this.body;
    }

}
