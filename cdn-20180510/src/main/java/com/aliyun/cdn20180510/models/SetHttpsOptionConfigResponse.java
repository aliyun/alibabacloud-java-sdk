// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetHttpsOptionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetHttpsOptionConfigResponseBody body;

    public static SetHttpsOptionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHttpsOptionConfigResponse self = new SetHttpsOptionConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetHttpsOptionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHttpsOptionConfigResponse setBody(SetHttpsOptionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHttpsOptionConfigResponseBody getBody() {
        return this.body;
    }

}
