// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterDashboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterDashboardResponseBody body;

    public static DescribeClusterDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDashboardResponse self = new DescribeClusterDashboardResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterDashboardResponse setBody(DescribeClusterDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterDashboardResponseBody getBody() {
        return this.body;
    }

}
