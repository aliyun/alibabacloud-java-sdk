// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetInspectionReportDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInspectionReportDownloadUrlResponseBody body;

    public static GetInspectionReportDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionReportDownloadUrlResponse self = new GetInspectionReportDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetInspectionReportDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInspectionReportDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInspectionReportDownloadUrlResponse setBody(GetInspectionReportDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInspectionReportDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
