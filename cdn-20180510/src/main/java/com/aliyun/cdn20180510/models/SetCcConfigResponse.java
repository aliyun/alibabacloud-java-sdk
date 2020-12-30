// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCcConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCcConfigResponseBody body;

    public static SetCcConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCcConfigResponse self = new SetCcConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCcConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCcConfigResponse setBody(SetCcConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCcConfigResponseBody getBody() {
        return this.body;
    }

}
