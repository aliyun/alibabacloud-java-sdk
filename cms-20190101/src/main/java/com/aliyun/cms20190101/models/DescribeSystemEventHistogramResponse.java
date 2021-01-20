// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSystemEventHistogramResponseBody body;

    public static DescribeSystemEventHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventHistogramResponse self = new DescribeSystemEventHistogramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemEventHistogramResponse setBody(DescribeSystemEventHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemEventHistogramResponseBody getBody() {
        return this.body;
    }

}
