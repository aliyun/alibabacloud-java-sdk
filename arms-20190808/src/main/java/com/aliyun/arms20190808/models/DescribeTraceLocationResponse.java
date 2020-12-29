// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTraceLocationResponseBody body;

    public static DescribeTraceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLocationResponse self = new DescribeTraceLocationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTraceLocationResponse setBody(DescribeTraceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceLocationResponseBody getBody() {
        return this.body;
    }

}
