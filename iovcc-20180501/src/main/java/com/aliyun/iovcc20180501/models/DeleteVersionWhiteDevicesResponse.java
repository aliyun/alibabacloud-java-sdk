// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionWhiteDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionWhiteDevicesResponseBody body;

    public static DeleteVersionWhiteDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionWhiteDevicesResponse self = new DeleteVersionWhiteDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionWhiteDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionWhiteDevicesResponse setBody(DeleteVersionWhiteDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionWhiteDevicesResponseBody getBody() {
        return this.body;
    }

}
