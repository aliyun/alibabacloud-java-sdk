// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReportStressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReportStressResponseBody body;

    public static ReportStressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportStressResponse self = new ReportStressResponse();
        return TeaModel.build(map, self);
    }

    public ReportStressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportStressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportStressResponse setBody(ReportStressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportStressResponseBody getBody() {
        return this.body;
    }

}
