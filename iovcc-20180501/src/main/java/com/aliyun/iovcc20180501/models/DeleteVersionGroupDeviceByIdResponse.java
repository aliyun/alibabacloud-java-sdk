// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionGroupDeviceByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionGroupDeviceByIdResponseBody body;

    public static DeleteVersionGroupDeviceByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionGroupDeviceByIdResponse self = new DeleteVersionGroupDeviceByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionGroupDeviceByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionGroupDeviceByIdResponse setBody(DeleteVersionGroupDeviceByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionGroupDeviceByIdResponseBody getBody() {
        return this.body;
    }

}
