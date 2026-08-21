// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketPageQueryScenicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketPageQueryScenicResponseBody body;

    public static TicketPageQueryScenicResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketPageQueryScenicResponse self = new TicketPageQueryScenicResponse();
        return TeaModel.build(map, self);
    }

    public TicketPageQueryScenicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketPageQueryScenicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketPageQueryScenicResponse setBody(TicketPageQueryScenicResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketPageQueryScenicResponseBody getBody() {
        return this.body;
    }

}
