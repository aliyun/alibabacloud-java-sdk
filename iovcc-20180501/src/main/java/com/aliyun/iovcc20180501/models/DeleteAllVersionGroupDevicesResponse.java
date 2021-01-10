// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteAllVersionGroupDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAllVersionGroupDevicesResponseBody body;

    public static DeleteAllVersionGroupDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllVersionGroupDevicesResponse self = new DeleteAllVersionGroupDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAllVersionGroupDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAllVersionGroupDevicesResponse setBody(DeleteAllVersionGroupDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAllVersionGroupDevicesResponseBody getBody() {
        return this.body;
    }

}
