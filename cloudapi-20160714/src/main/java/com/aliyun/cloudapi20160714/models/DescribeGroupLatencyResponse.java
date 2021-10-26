// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupLatencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupLatencyResponseBody body;

    public static DescribeGroupLatencyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupLatencyResponse self = new DescribeGroupLatencyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupLatencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupLatencyResponse setBody(DescribeGroupLatencyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupLatencyResponseBody getBody() {
        return this.body;
    }

}
