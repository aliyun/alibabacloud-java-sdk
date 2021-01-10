// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAssistReportResponseBody body;

    public static DescribeAssistReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistReportResponse self = new DescribeAssistReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssistReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssistReportResponse setBody(DescribeAssistReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssistReportResponseBody getBody() {
        return this.body;
    }

}
