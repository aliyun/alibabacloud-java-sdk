// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVirtualBorderRouterResponseBody body;

    public static DeleteVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualBorderRouterResponse self = new DeleteVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualBorderRouterResponse setBody(DeleteVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
