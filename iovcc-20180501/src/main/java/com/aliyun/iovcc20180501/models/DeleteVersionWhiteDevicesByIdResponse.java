// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionWhiteDevicesByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionWhiteDevicesByIdResponseBody body;

    public static DeleteVersionWhiteDevicesByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionWhiteDevicesByIdResponse self = new DeleteVersionWhiteDevicesByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionWhiteDevicesByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionWhiteDevicesByIdResponse setBody(DeleteVersionWhiteDevicesByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionWhiteDevicesByIdResponseBody getBody() {
        return this.body;
    }

}
