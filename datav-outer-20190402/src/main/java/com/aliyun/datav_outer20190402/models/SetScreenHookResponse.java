// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class SetScreenHookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetScreenHookResponseBody body;

    public static SetScreenHookResponse build(java.util.Map<String, ?> map) throws Exception {
        SetScreenHookResponse self = new SetScreenHookResponse();
        return TeaModel.build(map, self);
    }

    public SetScreenHookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetScreenHookResponse setBody(SetScreenHookResponseBody body) {
        this.body = body;
        return this;
    }
    public SetScreenHookResponseBody getBody() {
        return this.body;
    }

}
