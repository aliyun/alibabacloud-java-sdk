// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckReportStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCheckReportStatusResponseBody body;

    public static GetDataCheckReportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckReportStatusResponse self = new GetDataCheckReportStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCheckReportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCheckReportStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCheckReportStatusResponse setBody(GetDataCheckReportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCheckReportStatusResponseBody getBody() {
        return this.body;
    }

}
