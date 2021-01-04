// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUserFlowReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserFlowReportResponseBody body;

    public static DescribeUserFlowReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowReportResponse self = new DescribeUserFlowReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserFlowReportResponse setBody(DescribeUserFlowReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserFlowReportResponseBody getBody() {
        return this.body;
    }

}
