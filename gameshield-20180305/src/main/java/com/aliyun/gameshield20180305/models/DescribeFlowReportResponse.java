// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlowReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowReportResponseBody body;

    public static DescribeFlowReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowReportResponse self = new DescribeFlowReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowReportResponse setBody(DescribeFlowReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowReportResponseBody getBody() {
        return this.body;
    }

}
