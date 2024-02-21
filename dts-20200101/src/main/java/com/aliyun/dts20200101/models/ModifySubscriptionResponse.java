// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifySubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySubscriptionResponseBody body;

    public static ModifySubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionResponse self = new ModifySubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySubscriptionResponse setBody(ModifySubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySubscriptionResponseBody getBody() {
        return this.body;
    }

}
