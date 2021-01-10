// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLivePullStreamInfoConfigResponseBody body;

    public static DeleteLivePullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePullStreamInfoConfigResponse self = new DeleteLivePullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivePullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivePullStreamInfoConfigResponse setBody(DeleteLivePullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivePullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
