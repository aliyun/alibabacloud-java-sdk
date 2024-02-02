// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSnapshotPackageResponseBody body;

    public static DescribeSnapshotPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotPackageResponse self = new DescribeSnapshotPackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnapshotPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnapshotPackageResponse setBody(DescribeSnapshotPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotPackageResponseBody getBody() {
        return this.body;
    }

}
