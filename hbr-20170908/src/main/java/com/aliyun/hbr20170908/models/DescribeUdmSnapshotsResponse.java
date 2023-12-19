// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeUdmSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUdmSnapshotsResponseBody body;

    public static DescribeUdmSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUdmSnapshotsResponse self = new DescribeUdmSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUdmSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUdmSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUdmSnapshotsResponse setBody(DescribeUdmSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUdmSnapshotsResponseBody getBody() {
        return this.body;
    }

}
