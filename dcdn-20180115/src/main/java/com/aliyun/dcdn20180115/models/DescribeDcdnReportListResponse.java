// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnReportListResponseBody body;

    public static DescribeDcdnReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnReportListResponse self = new DescribeDcdnReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnReportListResponse setBody(DescribeDcdnReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnReportListResponseBody getBody() {
        return this.body;
    }

}
