// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePullStreamInfoConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLivePullStreamInfoConfigResponseBody body;

    public static AddLivePullStreamInfoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLivePullStreamInfoConfigResponse self = new AddLivePullStreamInfoConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLivePullStreamInfoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLivePullStreamInfoConfigResponse setBody(AddLivePullStreamInfoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLivePullStreamInfoConfigResponseBody getBody() {
        return this.body;
    }

}
