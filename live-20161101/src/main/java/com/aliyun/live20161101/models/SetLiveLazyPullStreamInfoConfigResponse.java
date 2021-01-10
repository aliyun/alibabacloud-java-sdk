// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveLazyPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetLiveLazyPullStreamInfoConfigResponseBody body;

    public static SetLiveLazyPullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveLazyPullStreamInfoConfigResponse self = new SetLiveLazyPullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveLazyPullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveLazyPullStreamInfoConfigResponse setBody(SetLiveLazyPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveLazyPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
