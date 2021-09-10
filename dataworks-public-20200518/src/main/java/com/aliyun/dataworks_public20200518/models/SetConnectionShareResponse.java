// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetConnectionShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetConnectionShareResponseBody body;

    public static SetConnectionShareResponse build(java.util.Map<String, ?> map) throws Exception {
        SetConnectionShareResponse self = new SetConnectionShareResponse();
        return TeaModel.build(map, self);
    }

    public SetConnectionShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetConnectionShareResponse setBody(SetConnectionShareResponseBody body) {
        this.body = body;
        return this;
    }
    public SetConnectionShareResponseBody getBody() {
        return this.body;
    }

}
