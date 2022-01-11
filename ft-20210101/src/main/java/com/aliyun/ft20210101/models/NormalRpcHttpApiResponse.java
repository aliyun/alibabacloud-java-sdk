// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class NormalRpcHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NormalRpcHttpApiResponseBody body;

    public static NormalRpcHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        NormalRpcHttpApiResponse self = new NormalRpcHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public NormalRpcHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NormalRpcHttpApiResponse setBody(NormalRpcHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public NormalRpcHttpApiResponseBody getBody() {
        return this.body;
    }

}
