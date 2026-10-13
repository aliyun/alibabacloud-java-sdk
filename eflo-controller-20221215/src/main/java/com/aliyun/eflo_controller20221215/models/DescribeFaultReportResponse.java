// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeFaultReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFaultReportResponseBody body;

    public static DescribeFaultReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultReportResponse self = new DescribeFaultReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaultReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaultReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFaultReportResponse setBody(DescribeFaultReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaultReportResponseBody getBody() {
        return this.body;
    }

}
