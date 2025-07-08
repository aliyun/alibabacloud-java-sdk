// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportTmpEffectReportDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportTmpEffectReportDataResponseBody body;

    public static ExportTmpEffectReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportTmpEffectReportDataResponse self = new ExportTmpEffectReportDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportTmpEffectReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportTmpEffectReportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportTmpEffectReportDataResponse setBody(ExportTmpEffectReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportTmpEffectReportDataResponseBody getBody() {
        return this.body;
    }

}
