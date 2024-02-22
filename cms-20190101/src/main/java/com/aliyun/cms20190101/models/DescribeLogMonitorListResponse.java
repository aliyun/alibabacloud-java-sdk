// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogMonitorListResponseBody body;

    public static DescribeLogMonitorListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMonitorListResponse self = new DescribeLogMonitorListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogMonitorListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogMonitorListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogMonitorListResponse setBody(DescribeLogMonitorListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogMonitorListResponseBody getBody() {
        return this.body;
    }

}
