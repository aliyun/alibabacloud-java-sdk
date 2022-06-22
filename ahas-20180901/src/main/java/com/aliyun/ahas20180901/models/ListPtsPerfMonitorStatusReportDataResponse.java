// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfMonitorStatusReportDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPtsPerfMonitorStatusReportDataResponseBody body;

    public static ListPtsPerfMonitorStatusReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfMonitorStatusReportDataResponse self = new ListPtsPerfMonitorStatusReportDataResponse();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfMonitorStatusReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPtsPerfMonitorStatusReportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPtsPerfMonitorStatusReportDataResponse setBody(ListPtsPerfMonitorStatusReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPtsPerfMonitorStatusReportDataResponseBody getBody() {
        return this.body;
    }

}
