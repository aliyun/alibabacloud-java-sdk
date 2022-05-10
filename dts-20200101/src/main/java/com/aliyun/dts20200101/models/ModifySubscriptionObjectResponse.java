// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifySubscriptionObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySubscriptionObjectResponseBody body;

    public static ModifySubscriptionObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionObjectResponse self = new ModifySubscriptionObjectResponse();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySubscriptionObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySubscriptionObjectResponse setBody(ModifySubscriptionObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySubscriptionObjectResponseBody getBody() {
        return this.body;
    }

}
