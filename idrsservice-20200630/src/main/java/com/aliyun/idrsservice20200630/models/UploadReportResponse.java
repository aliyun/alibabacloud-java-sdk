// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UploadReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadReportResponseBody body;

    public static UploadReportResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadReportResponse self = new UploadReportResponse();
        return TeaModel.build(map, self);
    }

    public UploadReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadReportResponse setBody(UploadReportResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadReportResponseBody getBody() {
        return this.body;
    }

}
