// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSnapshotGroupsResponseBody body;

    public static DescribeSnapshotGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotGroupsResponse self = new DescribeSnapshotGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnapshotGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnapshotGroupsResponse setBody(DescribeSnapshotGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotGroupsResponseBody getBody() {
        return this.body;
    }

}
