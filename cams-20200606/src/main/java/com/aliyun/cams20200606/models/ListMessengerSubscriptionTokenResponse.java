// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessengerSubscriptionTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMessengerSubscriptionTokenResponseBody body;

    public static ListMessengerSubscriptionTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessengerSubscriptionTokenResponse self = new ListMessengerSubscriptionTokenResponse();
        return TeaModel.build(map, self);
    }

    public ListMessengerSubscriptionTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessengerSubscriptionTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessengerSubscriptionTokenResponse setBody(ListMessengerSubscriptionTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessengerSubscriptionTokenResponseBody getBody() {
        return this.body;
    }

}
