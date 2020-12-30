// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifySenderAddressNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySenderAddressNotificationResponseBody body;

    public static ModifySenderAddressNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySenderAddressNotificationResponse self = new ModifySenderAddressNotificationResponse();
        return TeaModel.build(map, self);
    }

    public ModifySenderAddressNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySenderAddressNotificationResponse setBody(ModifySenderAddressNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySenderAddressNotificationResponseBody getBody() {
        return this.body;
    }

}
