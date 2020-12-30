// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowEntitySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowEntitySnapshotResponseBody body;

    public static DescribeFlowEntitySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowEntitySnapshotResponse self = new DescribeFlowEntitySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowEntitySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowEntitySnapshotResponse setBody(DescribeFlowEntitySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowEntitySnapshotResponseBody getBody() {
        return this.body;
    }

}
