// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PushApplicationDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushApplicationDataResponseBody body;

    public static PushApplicationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushApplicationDataResponse self = new PushApplicationDataResponse();
        return TeaModel.build(map, self);
    }

    public PushApplicationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushApplicationDataResponse setBody(PushApplicationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushApplicationDataResponseBody getBody() {
        return this.body;
    }

}
