// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeEdgeContainerAppStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEdgeContainerAppStatsResponseBody body;

    public static DescribeEdgeContainerAppStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeContainerAppStatsResponse self = new DescribeEdgeContainerAppStatsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeContainerAppStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeContainerAppStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdgeContainerAppStatsResponse setBody(DescribeEdgeContainerAppStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeContainerAppStatsResponseBody getBody() {
        return this.body;
    }

}
