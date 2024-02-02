// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSnapshotMonitorDataResponseBody body;

    public static DescribeSnapshotMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotMonitorDataResponse self = new DescribeSnapshotMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnapshotMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnapshotMonitorDataResponse setBody(DescribeSnapshotMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotMonitorDataResponseBody getBody() {
        return this.body;
    }

}
