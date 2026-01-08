// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SyncMessengerSubscriptionTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncMessengerSubscriptionTokenResponseBody body;

    public static SyncMessengerSubscriptionTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMessengerSubscriptionTokenResponse self = new SyncMessengerSubscriptionTokenResponse();
        return TeaModel.build(map, self);
    }

    public SyncMessengerSubscriptionTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMessengerSubscriptionTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncMessengerSubscriptionTokenResponse setBody(SyncMessengerSubscriptionTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMessengerSubscriptionTokenResponseBody getBody() {
        return this.body;
    }

}
