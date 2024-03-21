// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSnapshotsResponseBody body;

    public static DescribeSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponse self = new DescribeSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnapshotsResponse setBody(DescribeSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotsResponseBody getBody() {
        return this.body;
    }

}
