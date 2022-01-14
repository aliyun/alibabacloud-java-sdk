// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SetMsacAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetMsacAppResponseBody body;

    public static SetMsacAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMsacAppResponse self = new SetMsacAppResponse();
        return TeaModel.build(map, self);
    }

    public SetMsacAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMsacAppResponse setBody(SetMsacAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMsacAppResponseBody getBody() {
        return this.body;
    }

}
