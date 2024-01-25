// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeOtsTableSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOtsTableSnapshotsResponseBody body;

    public static DescribeOtsTableSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOtsTableSnapshotsResponse self = new DescribeOtsTableSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOtsTableSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOtsTableSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOtsTableSnapshotsResponse setBody(DescribeOtsTableSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOtsTableSnapshotsResponseBody getBody() {
        return this.body;
    }

}
