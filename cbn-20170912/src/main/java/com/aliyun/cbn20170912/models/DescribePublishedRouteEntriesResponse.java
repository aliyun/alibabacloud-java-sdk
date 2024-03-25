// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribePublishedRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePublishedRouteEntriesResponseBody body;

    public static DescribePublishedRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishedRouteEntriesResponse self = new DescribePublishedRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublishedRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePublishedRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePublishedRouteEntriesResponse setBody(DescribePublishedRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
