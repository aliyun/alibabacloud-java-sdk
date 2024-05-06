// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySubscriptionDescriptionResponseBody body;

    public static ModifySubscriptionDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionDescriptionResponse self = new ModifySubscriptionDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySubscriptionDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySubscriptionDescriptionResponse setBody(ModifySubscriptionDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySubscriptionDescriptionResponseBody getBody() {
        return this.body;
    }

}
