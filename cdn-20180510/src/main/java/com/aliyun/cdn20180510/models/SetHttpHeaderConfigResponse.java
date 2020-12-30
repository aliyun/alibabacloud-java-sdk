// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetHttpHeaderConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetHttpHeaderConfigResponseBody body;

    public static SetHttpHeaderConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHttpHeaderConfigResponse self = new SetHttpHeaderConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetHttpHeaderConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHttpHeaderConfigResponse setBody(SetHttpHeaderConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHttpHeaderConfigResponseBody getBody() {
        return this.body;
    }

}
