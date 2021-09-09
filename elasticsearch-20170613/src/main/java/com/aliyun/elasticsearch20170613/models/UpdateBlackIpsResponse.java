// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateBlackIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBlackIpsResponseBody body;

    public static UpdateBlackIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackIpsResponse self = new UpdateBlackIpsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBlackIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBlackIpsResponse setBody(UpdateBlackIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBlackIpsResponseBody getBody() {
        return this.body;
    }

}
