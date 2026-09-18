// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternCompareReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlPatternCompareReportResponseBody body;

    public static DescribeSqlPatternCompareReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternCompareReportResponse self = new DescribeSqlPatternCompareReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternCompareReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlPatternCompareReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlPatternCompareReportResponse setBody(DescribeSqlPatternCompareReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlPatternCompareReportResponseBody getBody() {
        return this.body;
    }

}
