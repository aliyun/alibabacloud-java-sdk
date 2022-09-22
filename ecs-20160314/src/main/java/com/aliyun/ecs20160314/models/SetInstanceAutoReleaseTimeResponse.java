// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class SetInstanceAutoReleaseTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetInstanceAutoReleaseTimeResponseBody body;

    public static SetInstanceAutoReleaseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceAutoReleaseTimeResponse self = new SetInstanceAutoReleaseTimeResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceAutoReleaseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceAutoReleaseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetInstanceAutoReleaseTimeResponse setBody(SetInstanceAutoReleaseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceAutoReleaseTimeResponseBody getBody() {
        return this.body;
    }

}
