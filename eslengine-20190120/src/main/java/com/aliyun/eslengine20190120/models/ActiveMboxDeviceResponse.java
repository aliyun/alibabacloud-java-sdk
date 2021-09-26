// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120.models;

import com.aliyun.tea.*;

public class ActiveMboxDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActiveMboxDeviceResponseBody body;

    public static ActiveMboxDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveMboxDeviceResponse self = new ActiveMboxDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ActiveMboxDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveMboxDeviceResponse setBody(ActiveMboxDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveMboxDeviceResponseBody getBody() {
        return this.body;
    }

}
