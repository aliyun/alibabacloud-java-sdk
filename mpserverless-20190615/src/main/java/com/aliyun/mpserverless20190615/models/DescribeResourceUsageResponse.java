// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceUsageResponseBody body;

    public static DescribeResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageResponse self = new DescribeResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceUsageResponse setBody(DescribeResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceUsageResponseBody getBody() {
        return this.body;
    }

}
