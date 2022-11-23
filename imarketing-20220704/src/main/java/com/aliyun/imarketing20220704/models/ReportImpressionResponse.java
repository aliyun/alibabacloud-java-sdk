// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ReportImpressionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReportImpressionResponseBody body;

    public static ReportImpressionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportImpressionResponse self = new ReportImpressionResponse();
        return TeaModel.build(map, self);
    }

    public ReportImpressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportImpressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportImpressionResponse setBody(ReportImpressionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportImpressionResponseBody getBody() {
        return this.body;
    }

}
