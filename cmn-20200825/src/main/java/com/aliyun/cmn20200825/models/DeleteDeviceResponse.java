// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceResponseBody body;

    public static DeleteDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceResponse self = new DeleteDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceResponse setBody(DeleteDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceResponseBody getBody() {
        return this.body;
    }

}
