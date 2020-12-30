// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeExcelAnalysisResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExcelAnalysisResultResponseBody body;

    public static DescribeExcelAnalysisResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcelAnalysisResultResponse self = new DescribeExcelAnalysisResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExcelAnalysisResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExcelAnalysisResultResponse setBody(DescribeExcelAnalysisResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExcelAnalysisResultResponseBody getBody() {
        return this.body;
    }

}
