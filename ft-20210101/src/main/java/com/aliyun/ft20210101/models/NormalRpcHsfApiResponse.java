// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class NormalRpcHsfApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NormalRpcHsfApiResponseBody body;

    public static NormalRpcHsfApiResponse build(java.util.Map<String, ?> map) throws Exception {
        NormalRpcHsfApiResponse self = new NormalRpcHsfApiResponse();
        return TeaModel.build(map, self);
    }

    public NormalRpcHsfApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NormalRpcHsfApiResponse setBody(NormalRpcHsfApiResponseBody body) {
        this.body = body;
        return this;
    }
    public NormalRpcHsfApiResponseBody getBody() {
        return this.body;
    }

}
