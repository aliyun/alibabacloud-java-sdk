// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListReportResponseBody body;

    public static ListReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReportResponse self = new ListReportResponse();
        return TeaModel.build(map, self);
    }

    public ListReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReportResponse setBody(ListReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReportResponseBody getBody() {
        return this.body;
    }

}
