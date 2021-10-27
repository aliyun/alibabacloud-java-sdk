// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupTableAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetupTableAsyncResponseBody body;

    public static SetupTableAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupTableAsyncResponse self = new SetupTableAsyncResponse();
        return TeaModel.build(map, self);
    }

    public SetupTableAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupTableAsyncResponse setBody(SetupTableAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupTableAsyncResponseBody getBody() {
        return this.body;
    }

}
