// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ApplyCallRecordExportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyCallRecordExportResponseBody body;

    public static ApplyCallRecordExportResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCallRecordExportResponse self = new ApplyCallRecordExportResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCallRecordExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCallRecordExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCallRecordExportResponse setBody(ApplyCallRecordExportResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCallRecordExportResponseBody getBody() {
        return this.body;
    }

}
