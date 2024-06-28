// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListTicketTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTicketTasksResponseBody body;

    public static ListTicketTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTicketTasksResponse self = new ListTicketTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTicketTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTicketTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTicketTasksResponse setBody(ListTicketTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTicketTasksResponseBody getBody() {
        return this.body;
    }

}
