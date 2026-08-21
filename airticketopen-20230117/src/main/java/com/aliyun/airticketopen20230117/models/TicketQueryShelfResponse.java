// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryShelfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketQueryShelfResponseBody body;

    public static TicketQueryShelfResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryShelfResponse self = new TicketQueryShelfResponse();
        return TeaModel.build(map, self);
    }

    public TicketQueryShelfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketQueryShelfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketQueryShelfResponse setBody(TicketQueryShelfResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketQueryShelfResponseBody getBody() {
        return this.body;
    }

}
