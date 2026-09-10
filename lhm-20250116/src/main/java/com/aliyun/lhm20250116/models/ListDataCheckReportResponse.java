// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCheckReportResponseBody body;

    public static ListDataCheckReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportResponse self = new ListDataCheckReportResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCheckReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCheckReportResponse setBody(ListDataCheckReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCheckReportResponseBody getBody() {
        return this.body;
    }

}
