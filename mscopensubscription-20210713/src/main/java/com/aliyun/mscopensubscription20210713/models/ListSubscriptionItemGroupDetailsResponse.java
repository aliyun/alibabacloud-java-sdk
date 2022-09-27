// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemGroupDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscriptionItemGroupDetailsResponseBody body;

    public static ListSubscriptionItemGroupDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionItemGroupDetailsResponse self = new ListSubscriptionItemGroupDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionItemGroupDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionItemGroupDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscriptionItemGroupDetailsResponse setBody(ListSubscriptionItemGroupDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionItemGroupDetailsResponseBody getBody() {
        return this.body;
    }

}
