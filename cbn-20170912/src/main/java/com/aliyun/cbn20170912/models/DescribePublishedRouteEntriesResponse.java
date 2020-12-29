// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribePublishedRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePublishedRouteEntriesResponse setBody(DescribePublishedRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
