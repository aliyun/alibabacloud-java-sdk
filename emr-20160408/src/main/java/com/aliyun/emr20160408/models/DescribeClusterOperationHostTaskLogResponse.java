// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterOperationHostTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterOperationHostTaskLogResponseBody body;

    public static DescribeClusterOperationHostTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterOperationHostTaskLogResponse self = new DescribeClusterOperationHostTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterOperationHostTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterOperationHostTaskLogResponse setBody(DescribeClusterOperationHostTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterOperationHostTaskLogResponseBody getBody() {
        return this.body;
    }

}
