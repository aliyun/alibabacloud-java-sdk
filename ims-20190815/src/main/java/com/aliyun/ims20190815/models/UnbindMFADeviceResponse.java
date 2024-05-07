// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnbindMFADeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindMFADeviceResponse setBody(UnbindMFADeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindMFADeviceResponseBody getBody() {
        return this.body;
    }

}
