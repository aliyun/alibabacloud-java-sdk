// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcePoolSchedulerTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterResourcePoolSchedulerTypeResponseBody body;

    public static DescribeClusterResourcePoolSchedulerTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourcePoolSchedulerTypeResponse self = new DescribeClusterResourcePoolSchedulerTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourcePoolSchedulerTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterResourcePoolSchedulerTypeResponse setBody(DescribeClusterResourcePoolSchedulerTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterResourcePoolSchedulerTypeResponseBody getBody() {
        return this.body;
    }

}
