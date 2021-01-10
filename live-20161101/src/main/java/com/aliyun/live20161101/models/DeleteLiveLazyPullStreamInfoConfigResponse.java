// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveLazyPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveLazyPullStreamInfoConfigResponseBody body;

    public static DeleteLiveLazyPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveLazyPullStreamInfoConfigResponse self = new DeleteLiveLazyPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveLazyPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveLazyPullStreamInfoConfigResponse setBody(DeleteLiveLazyPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveLazyPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
