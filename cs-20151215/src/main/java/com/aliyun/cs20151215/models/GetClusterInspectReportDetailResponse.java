// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterInspectReportDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterInspectReportDetailResponseBody body;

    public static GetClusterInspectReportDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInspectReportDetailResponse self = new GetClusterInspectReportDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterInspectReportDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterInspectReportDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterInspectReportDetailResponse setBody(GetClusterInspectReportDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterInspectReportDetailResponseBody getBody() {
        return this.body;
    }

}
