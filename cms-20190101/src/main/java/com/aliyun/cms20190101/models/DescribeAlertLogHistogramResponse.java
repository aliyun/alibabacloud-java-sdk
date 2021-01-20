// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogHistogramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertLogHistogramResponseBody body;

    public static DescribeAlertLogHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogHistogramResponse self = new DescribeAlertLogHistogramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertLogHistogramResponse setBody(DescribeAlertLogHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertLogHistogramResponseBody getBody() {
        return this.body;
    }

}
