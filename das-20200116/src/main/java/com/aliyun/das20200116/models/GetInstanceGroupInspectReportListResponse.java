// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceGroupInspectReportListResponseBody body;

    public static GetInstanceGroupInspectReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGroupInspectReportListResponse self = new GetInstanceGroupInspectReportListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceGroupInspectReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceGroupInspectReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceGroupInspectReportListResponse setBody(GetInstanceGroupInspectReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceGroupInspectReportListResponseBody getBody() {
        return this.body;
    }

}
