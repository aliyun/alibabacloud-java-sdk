// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionGroupDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionGroupDeviceResponseBody body;

    public static DeleteVersionGroupDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionGroupDeviceResponse self = new DeleteVersionGroupDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionGroupDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionGroupDeviceResponse setBody(DeleteVersionGroupDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionGroupDeviceResponseBody getBody() {
        return this.body;
    }

}
