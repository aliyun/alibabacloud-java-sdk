// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTransitRouterResponseBody body;

    public static DeleteTransitRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterResponse self = new DeleteTransitRouterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterResponse setBody(DeleteTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterResponseBody getBody() {
        return this.body;
    }

}
