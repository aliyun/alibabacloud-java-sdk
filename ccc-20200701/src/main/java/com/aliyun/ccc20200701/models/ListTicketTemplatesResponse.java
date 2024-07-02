// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListTicketTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTicketTemplatesResponseBody body;

    public static ListTicketTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTicketTemplatesResponse self = new ListTicketTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListTicketTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTicketTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTicketTemplatesResponse setBody(ListTicketTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTicketTemplatesResponseBody getBody() {
        return this.body;
    }

}
