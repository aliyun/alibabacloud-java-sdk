// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTicketOperateRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTicketOperateRecordResponseBody body;

    public static ListTicketOperateRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTicketOperateRecordResponse self = new ListTicketOperateRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListTicketOperateRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTicketOperateRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTicketOperateRecordResponse setBody(ListTicketOperateRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTicketOperateRecordResponseBody getBody() {
        return this.body;
    }

}
