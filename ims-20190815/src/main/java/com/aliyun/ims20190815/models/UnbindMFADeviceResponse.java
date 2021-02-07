// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindMFADeviceResponseBody body;

    public static UnbindMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindMFADeviceResponse self = new UnbindMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindMFADeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindMFADeviceResponse setBody(UnbindMFADeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindMFADeviceResponseBody getBody() {
        return this.body;
    }

}
