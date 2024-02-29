// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoSnapshotTasksResponseBody body;

    public static DescribeAutoSnapshotTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotTasksResponse self = new DescribeAutoSnapshotTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoSnapshotTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoSnapshotTasksResponse setBody(DescribeAutoSnapshotTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoSnapshotTasksResponseBody getBody() {
        return this.body;
    }

}
