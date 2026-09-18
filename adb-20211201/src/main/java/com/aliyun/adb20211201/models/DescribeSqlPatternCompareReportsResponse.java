// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternCompareReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlPatternCompareReportsResponseBody body;

    public static DescribeSqlPatternCompareReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternCompareReportsResponse self = new DescribeSqlPatternCompareReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternCompareReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlPatternCompareReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlPatternCompareReportsResponse setBody(DescribeSqlPatternCompareReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlPatternCompareReportsResponseBody getBody() {
        return this.body;
    }

}
