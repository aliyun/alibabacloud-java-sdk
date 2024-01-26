// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirtualMFADeviceResponseBody body;

    public static DeleteVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualMFADeviceResponse self = new DeleteVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualMFADeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualMFADeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirtualMFADeviceResponse setBody(DeleteVirtualMFADeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualMFADeviceResponseBody getBody() {
        return this.body;
    }

}
