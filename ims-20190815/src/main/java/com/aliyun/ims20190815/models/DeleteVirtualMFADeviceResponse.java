// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
