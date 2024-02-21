// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SetEventSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetEventSubscriptionResponseBody body;

    public static SetEventSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEventSubscriptionResponse self = new SetEventSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public SetEventSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEventSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetEventSubscriptionResponse setBody(SetEventSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEventSubscriptionResponseBody getBody() {
        return this.body;
    }

}
