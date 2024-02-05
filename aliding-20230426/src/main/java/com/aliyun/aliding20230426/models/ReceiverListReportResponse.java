// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ReceiverListReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReceiverListReportResponseBody body;

    public static ReceiverListReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ReceiverListReportResponse self = new ReceiverListReportResponse();
        return TeaModel.build(map, self);
    }

    public ReceiverListReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReceiverListReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReceiverListReportResponse setBody(ReceiverListReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ReceiverListReportResponseBody getBody() {
        return this.body;
    }

}
