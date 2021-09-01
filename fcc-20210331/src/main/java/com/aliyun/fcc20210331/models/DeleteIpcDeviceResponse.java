// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteIpcDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpcDeviceResponseBody body;

    public static DeleteIpcDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpcDeviceResponse self = new DeleteIpcDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpcDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpcDeviceResponse setBody(DeleteIpcDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpcDeviceResponseBody getBody() {
        return this.body;
    }

}
