// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventHistogramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomEventHistogramResponseBody body;

    public static DescribeCustomEventHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventHistogramResponse self = new DescribeCustomEventHistogramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomEventHistogramResponse setBody(DescribeCustomEventHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomEventHistogramResponseBody getBody() {
        return this.body;
    }

}
