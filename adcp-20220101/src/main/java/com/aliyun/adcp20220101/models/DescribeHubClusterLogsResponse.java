// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHubClusterLogsResponseBody body;

    public static DescribeHubClusterLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterLogsResponse self = new DescribeHubClusterLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHubClusterLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHubClusterLogsResponse setBody(DescribeHubClusterLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHubClusterLogsResponseBody getBody() {
        return this.body;
    }

}
