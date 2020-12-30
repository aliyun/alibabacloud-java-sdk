// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetMeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetMeResponseBody body;

    public static SetMeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMeResponse self = new SetMeResponse();
        return TeaModel.build(map, self);
    }

    public SetMeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMeResponse setBody(SetMeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMeResponseBody getBody() {
        return this.body;
    }

}
