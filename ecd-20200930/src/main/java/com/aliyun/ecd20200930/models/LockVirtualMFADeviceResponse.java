// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class LockVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LockVirtualMFADeviceResponseBody body;

    public static LockVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        LockVirtualMFADeviceResponse self = new LockVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public LockVirtualMFADeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockVirtualMFADeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockVirtualMFADeviceResponse setBody(LockVirtualMFADeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public LockVirtualMFADeviceResponseBody getBody() {
        return this.body;
    }

}
