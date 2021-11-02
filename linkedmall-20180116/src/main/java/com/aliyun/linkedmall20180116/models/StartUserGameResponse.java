// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class StartUserGameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartUserGameResponseBody body;

    public static StartUserGameResponse build(java.util.Map<String, ?> map) throws Exception {
        StartUserGameResponse self = new StartUserGameResponse();
        return TeaModel.build(map, self);
    }

    public StartUserGameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartUserGameResponse setBody(StartUserGameResponseBody body) {
        this.body = body;
        return this;
    }
    public StartUserGameResponseBody getBody() {
        return this.body;
    }

}
