// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ApplyGroupNumberExportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyGroupNumberExportResponseBody body;

    public static ApplyGroupNumberExportResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyGroupNumberExportResponse self = new ApplyGroupNumberExportResponse();
        return TeaModel.build(map, self);
    }

    public ApplyGroupNumberExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyGroupNumberExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyGroupNumberExportResponse setBody(ApplyGroupNumberExportResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyGroupNumberExportResponseBody getBody() {
        return this.body;
    }

}
