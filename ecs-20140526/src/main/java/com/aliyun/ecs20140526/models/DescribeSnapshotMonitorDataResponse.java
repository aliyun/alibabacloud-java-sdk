// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSnapshotMonitorDataResponse setBody(DescribeSnapshotMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotMonitorDataResponseBody getBody() {
        return this.body;
    }

}
