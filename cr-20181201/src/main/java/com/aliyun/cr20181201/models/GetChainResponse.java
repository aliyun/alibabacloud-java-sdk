// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetChainResponseBody body;

    public static GetChainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChainResponse self = new GetChainResponse();
        return TeaModel.build(map, self);
    }

    public GetChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChainResponse setBody(GetChainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChainResponseBody getBody() {
        return this.body;
    }

}
