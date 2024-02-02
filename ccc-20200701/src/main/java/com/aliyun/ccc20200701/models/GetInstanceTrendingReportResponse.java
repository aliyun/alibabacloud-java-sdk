// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetInstanceTrendingReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceTrendingReportResponseBody body;

    public static GetInstanceTrendingReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrendingReportResponse self = new GetInstanceTrendingReportResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrendingReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceTrendingReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceTrendingReportResponse setBody(GetInstanceTrendingReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceTrendingReportResponseBody getBody() {
        return this.body;
    }

}
