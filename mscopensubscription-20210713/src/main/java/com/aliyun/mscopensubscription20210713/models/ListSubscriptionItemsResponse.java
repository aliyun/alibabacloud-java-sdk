// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscriptionItemsResponseBody body;

    public static ListSubscriptionItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionItemsResponse self = new ListSubscriptionItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscriptionItemsResponse setBody(ListSubscriptionItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionItemsResponseBody getBody() {
        return this.body;
    }

}
