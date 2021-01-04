// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDataCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataCenterResponseBody body;

    public static DescribeDataCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCenterResponse self = new DescribeDataCenterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataCenterResponse setBody(DescribeDataCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataCenterResponseBody getBody() {
        return this.body;
    }

}
