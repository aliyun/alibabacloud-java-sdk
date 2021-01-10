// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionBlackDevicesByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionBlackDevicesByIdResponseBody body;

    public static DeleteVersionBlackDevicesByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionBlackDevicesByIdResponse self = new DeleteVersionBlackDevicesByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionBlackDevicesByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionBlackDevicesByIdResponse setBody(DeleteVersionBlackDevicesByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionBlackDevicesByIdResponseBody getBody() {
        return this.body;
    }

}
