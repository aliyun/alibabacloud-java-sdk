// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMonitorGroupInstancesResponseBody body;

    public static DescribeMonitorGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstancesResponse self = new DescribeMonitorGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorGroupInstancesResponse setBody(DescribeMonitorGroupInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorGroupInstancesResponseBody getBody() {
        return this.body;
    }

}
