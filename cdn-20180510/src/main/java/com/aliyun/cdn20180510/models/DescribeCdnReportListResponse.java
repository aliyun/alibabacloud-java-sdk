// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnReportListResponseBody body;

    public static DescribeCdnReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportListResponse self = new DescribeCdnReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnReportListResponse setBody(DescribeCdnReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnReportListResponseBody getBody() {
        return this.body;
    }

}
