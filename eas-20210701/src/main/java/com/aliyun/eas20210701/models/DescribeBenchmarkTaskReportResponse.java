// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBenchmarkTaskReportResponseBody body;

    public static DescribeBenchmarkTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBenchmarkTaskReportResponse self = new DescribeBenchmarkTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBenchmarkTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBenchmarkTaskReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBenchmarkTaskReportResponse setBody(DescribeBenchmarkTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBenchmarkTaskReportResponseBody getBody() {
        return this.body;
    }

}
