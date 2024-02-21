// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnReportResponseBody body;

    public static DescribeCdnReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportResponse self = new DescribeCdnReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnReportResponse setBody(DescribeCdnReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnReportResponseBody getBody() {
        return this.body;
    }

}
