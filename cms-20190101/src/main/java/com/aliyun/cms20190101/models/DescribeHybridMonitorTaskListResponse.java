// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridMonitorTaskListResponseBody body;

    public static DescribeHybridMonitorTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorTaskListResponse self = new DescribeHybridMonitorTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridMonitorTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridMonitorTaskListResponse setBody(DescribeHybridMonitorTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridMonitorTaskListResponseBody getBody() {
        return this.body;
    }

}
