// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetReportTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReportTaskStatusResponseBody body;

    public static GetReportTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportTaskStatusResponse self = new GetReportTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetReportTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReportTaskStatusResponse setBody(GetReportTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportTaskStatusResponseBody getBody() {
        return this.body;
    }

}
