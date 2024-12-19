// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DeleteDjbhReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDjbhReportResponseBody body;

    public static DeleteDjbhReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDjbhReportResponse self = new DeleteDjbhReportResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDjbhReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDjbhReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDjbhReportResponse setBody(DeleteDjbhReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDjbhReportResponseBody getBody() {
        return this.body;
    }

}
