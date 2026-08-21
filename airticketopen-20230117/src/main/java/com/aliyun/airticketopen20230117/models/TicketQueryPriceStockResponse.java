// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryPriceStockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketQueryPriceStockResponseBody body;

    public static TicketQueryPriceStockResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryPriceStockResponse self = new TicketQueryPriceStockResponse();
        return TeaModel.build(map, self);
    }

    public TicketQueryPriceStockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketQueryPriceStockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketQueryPriceStockResponse setBody(TicketQueryPriceStockResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketQueryPriceStockResponseBody getBody() {
        return this.body;
    }

}
