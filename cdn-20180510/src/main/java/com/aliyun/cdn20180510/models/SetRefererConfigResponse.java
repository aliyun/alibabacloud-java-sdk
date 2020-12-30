// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRefererConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetRefererConfigResponseBody body;

    public static SetRefererConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRefererConfigResponse self = new SetRefererConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetRefererConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRefererConfigResponse setBody(SetRefererConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRefererConfigResponseBody getBody() {
        return this.body;
    }

}
