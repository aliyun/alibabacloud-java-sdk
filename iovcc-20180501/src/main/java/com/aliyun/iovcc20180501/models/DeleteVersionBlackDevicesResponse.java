// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionBlackDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionBlackDevicesResponseBody body;

    public static DeleteVersionBlackDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionBlackDevicesResponse self = new DeleteVersionBlackDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionBlackDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionBlackDevicesResponse setBody(DeleteVersionBlackDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionBlackDevicesResponseBody getBody() {
        return this.body;
    }

}
