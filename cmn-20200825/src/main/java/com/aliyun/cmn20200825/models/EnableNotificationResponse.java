// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class EnableNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableNotificationResponseBody body;

    public static EnableNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableNotificationResponse self = new EnableNotificationResponse();
        return TeaModel.build(map, self);
    }

    public EnableNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableNotificationResponse setBody(EnableNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableNotificationResponseBody getBody() {
        return this.body;
    }

}
