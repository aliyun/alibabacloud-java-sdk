// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveAIPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAIPlanResponseBody body;

    public static RemoveAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAIPlanResponse self = new RemoveAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAIPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAIPlanResponse setBody(RemoveAIPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAIPlanResponseBody getBody() {
        return this.body;
    }

}
