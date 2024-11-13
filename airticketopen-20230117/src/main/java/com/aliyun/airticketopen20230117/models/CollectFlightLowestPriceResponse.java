// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CollectFlightLowestPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CollectFlightLowestPriceResponseBody body;

    public static CollectFlightLowestPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        CollectFlightLowestPriceResponse self = new CollectFlightLowestPriceResponse();
        return TeaModel.build(map, self);
    }

    public CollectFlightLowestPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollectFlightLowestPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CollectFlightLowestPriceResponse setBody(CollectFlightLowestPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public CollectFlightLowestPriceResponseBody getBody() {
        return this.body;
    }

}
