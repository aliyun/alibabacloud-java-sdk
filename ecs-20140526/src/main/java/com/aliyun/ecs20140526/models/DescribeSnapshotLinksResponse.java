// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSnapshotLinksResponseBody body;

    public static DescribeSnapshotLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotLinksResponse self = new DescribeSnapshotLinksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnapshotLinksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnapshotLinksResponse setBody(DescribeSnapshotLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotLinksResponseBody getBody() {
        return this.body;
    }

}
