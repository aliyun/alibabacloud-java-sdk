// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetInstanceNameResponseBody body;

    public static SetInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceNameResponse self = new SetInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceNameResponse setBody(SetInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceNameResponseBody getBody() {
        return this.body;
    }

}
