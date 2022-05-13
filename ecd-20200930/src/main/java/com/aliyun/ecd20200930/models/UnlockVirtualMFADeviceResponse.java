// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnlockVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnlockVirtualMFADeviceResponseBody body;

    public static UnlockVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockVirtualMFADeviceResponse self = new UnlockVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnlockVirtualMFADeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockVirtualMFADeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockVirtualMFADeviceResponse setBody(UnlockVirtualMFADeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockVirtualMFADeviceResponseBody getBody() {
        return this.body;
    }

}
