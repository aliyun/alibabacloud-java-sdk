// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyAccountNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccountNotificationResponseBody body;

    public static ModifyAccountNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountNotificationResponse self = new ModifyAccountNotificationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountNotificationResponse setBody(ModifyAccountNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountNotificationResponseBody getBody() {
        return this.body;
    }

}
