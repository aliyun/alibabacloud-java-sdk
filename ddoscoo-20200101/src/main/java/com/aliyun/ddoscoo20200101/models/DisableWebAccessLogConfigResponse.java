// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebAccessLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableWebAccessLogConfigResponseBody body;

    public static DisableWebAccessLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableWebAccessLogConfigResponse self = new DisableWebAccessLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DisableWebAccessLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableWebAccessLogConfigResponse setBody(DisableWebAccessLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableWebAccessLogConfigResponseBody getBody() {
        return this.body;
    }

}
