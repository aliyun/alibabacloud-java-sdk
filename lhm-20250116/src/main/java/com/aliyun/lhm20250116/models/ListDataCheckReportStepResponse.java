// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportStepResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCheckReportStepResponseBody body;

    public static ListDataCheckReportStepResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportStepResponse self = new ListDataCheckReportStepResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCheckReportStepResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCheckReportStepResponse setBody(ListDataCheckReportStepResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCheckReportStepResponseBody getBody() {
        return this.body;
    }

}
