// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbortRunResponseBody body;

    public static AbortRunResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortRunResponse self = new AbortRunResponse();
        return TeaModel.build(map, self);
    }

    public AbortRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortRunResponse setBody(AbortRunResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortRunResponseBody getBody() {
        return this.body;
    }

}
