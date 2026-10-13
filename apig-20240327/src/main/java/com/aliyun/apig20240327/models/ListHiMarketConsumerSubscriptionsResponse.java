// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHiMarketConsumerSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHiMarketConsumerSubscriptionsResponseBody body;

    public static ListHiMarketConsumerSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHiMarketConsumerSubscriptionsResponse self = new ListHiMarketConsumerSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListHiMarketConsumerSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHiMarketConsumerSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHiMarketConsumerSubscriptionsResponse setBody(ListHiMarketConsumerSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHiMarketConsumerSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
