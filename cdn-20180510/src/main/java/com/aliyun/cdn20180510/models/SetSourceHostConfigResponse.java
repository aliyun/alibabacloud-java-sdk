// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetSourceHostConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetSourceHostConfigResponseBody body;

    public static SetSourceHostConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSourceHostConfigResponse self = new SetSourceHostConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetSourceHostConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSourceHostConfigResponse setBody(SetSourceHostConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSourceHostConfigResponseBody getBody() {
        return this.body;
    }

}
