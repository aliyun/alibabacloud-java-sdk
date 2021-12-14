// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class SetPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetPasswordResponseBody body;

    public static SetPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordResponse self = new SetPasswordResponse();
        return TeaModel.build(map, self);
    }

    public SetPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPasswordResponse setBody(SetPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPasswordResponseBody getBody() {
        return this.body;
    }

}
