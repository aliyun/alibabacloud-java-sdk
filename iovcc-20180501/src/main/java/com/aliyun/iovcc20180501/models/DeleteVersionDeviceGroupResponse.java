// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionDeviceGroupResponseBody body;

    public static DeleteVersionDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionDeviceGroupResponse self = new DeleteVersionDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionDeviceGroupResponse setBody(DeleteVersionDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
