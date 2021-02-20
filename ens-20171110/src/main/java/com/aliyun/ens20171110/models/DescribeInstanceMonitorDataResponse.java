// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceMonitorDataResponseBody body;

    public static DescribeInstanceMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMonitorDataResponse self = new DescribeInstanceMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMonitorDataResponse setBody(DescribeInstanceMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMonitorDataResponseBody getBody() {
        return this.body;
    }

}
