// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceGroupInspectReportDetailResponseBody body;

    public static GetInstanceGroupInspectReportDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGroupInspectReportDetailResponse self = new GetInstanceGroupInspectReportDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceGroupInspectReportDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceGroupInspectReportDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceGroupInspectReportDetailResponse setBody(GetInstanceGroupInspectReportDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceGroupInspectReportDetailResponseBody getBody() {
        return this.body;
    }

}
