// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSnapshotLinksResponse setBody(DescribeSnapshotLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotLinksResponseBody getBody() {
        return this.body;
    }

}
