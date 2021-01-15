// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DisableNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableNotificationResponseBody body;

    public static DisableNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableNotificationResponse self = new DisableNotificationResponse();
        return TeaModel.build(map, self);
    }

    public DisableNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableNotificationResponse setBody(DisableNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableNotificationResponseBody getBody() {
        return this.body;
    }

}
