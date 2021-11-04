// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnFreezeUserPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnFreezeUserPointResponseBody body;

    public static UnFreezeUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        UnFreezeUserPointResponse self = new UnFreezeUserPointResponse();
        return TeaModel.build(map, self);
    }

    public UnFreezeUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnFreezeUserPointResponse setBody(UnFreezeUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public UnFreezeUserPointResponseBody getBody() {
        return this.body;
    }

}
