// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstanceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetInstanceUserResponseBody body;

    public static SetInstanceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceUserResponse self = new SetInstanceUserResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceUserResponse setBody(SetInstanceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceUserResponseBody getBody() {
        return this.body;
    }

}
