// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveLazyPullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetLiveLazyPullStreamInfoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveLazyPullStreamInfoConfigResponse setBody(SetLiveLazyPullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveLazyPullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
