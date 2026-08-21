// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryScenicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketQueryScenicResponseBody body;

    public static TicketQueryScenicResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryScenicResponse self = new TicketQueryScenicResponse();
        return TeaModel.build(map, self);
    }

    public TicketQueryScenicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketQueryScenicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketQueryScenicResponse setBody(TicketQueryScenicResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketQueryScenicResponseBody getBody() {
        return this.body;
    }

}
