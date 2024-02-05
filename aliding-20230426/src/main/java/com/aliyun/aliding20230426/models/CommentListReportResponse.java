// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommentListReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommentListReportResponseBody body;

    public static CommentListReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CommentListReportResponse self = new CommentListReportResponse();
        return TeaModel.build(map, self);
    }

    public CommentListReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommentListReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommentListReportResponse setBody(CommentListReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CommentListReportResponseBody getBody() {
        return this.body;
    }

}
