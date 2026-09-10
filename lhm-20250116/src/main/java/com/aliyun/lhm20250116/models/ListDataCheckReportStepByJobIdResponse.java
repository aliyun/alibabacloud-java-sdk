// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportStepByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCheckReportStepByJobIdResponseBody body;

    public static ListDataCheckReportStepByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportStepByJobIdResponse self = new ListDataCheckReportStepByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportStepByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCheckReportStepByJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCheckReportStepByJobIdResponse setBody(ListDataCheckReportStepByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCheckReportStepByJobIdResponseBody getBody() {
        return this.body;
    }

}
