// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppAdaptorReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppAdaptorReportResponseBody body;

    public static GetAppAdaptorReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppAdaptorReportResponse self = new GetAppAdaptorReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAppAdaptorReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppAdaptorReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppAdaptorReportResponse setBody(GetAppAdaptorReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppAdaptorReportResponseBody getBody() {
        return this.body;
    }

}
