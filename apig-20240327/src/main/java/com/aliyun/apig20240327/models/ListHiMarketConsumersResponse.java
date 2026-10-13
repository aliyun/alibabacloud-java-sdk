// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHiMarketConsumersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHiMarketConsumersResponseBody body;

    public static ListHiMarketConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHiMarketConsumersResponse self = new ListHiMarketConsumersResponse();
        return TeaModel.build(map, self);
    }

    public ListHiMarketConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHiMarketConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHiMarketConsumersResponse setBody(ListHiMarketConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHiMarketConsumersResponseBody getBody() {
        return this.body;
    }

}
