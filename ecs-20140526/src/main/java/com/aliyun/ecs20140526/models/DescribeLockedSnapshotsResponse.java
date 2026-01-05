// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLockedSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLockedSnapshotsResponseBody body;

    public static DescribeLockedSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLockedSnapshotsResponse self = new DescribeLockedSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLockedSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLockedSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLockedSnapshotsResponse setBody(DescribeLockedSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLockedSnapshotsResponseBody getBody() {
        return this.body;
    }

}
