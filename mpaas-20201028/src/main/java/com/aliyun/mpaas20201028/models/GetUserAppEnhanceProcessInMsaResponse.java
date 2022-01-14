// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppEnhanceProcessInMsaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserAppEnhanceProcessInMsaResponseBody body;

    public static GetUserAppEnhanceProcessInMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppEnhanceProcessInMsaResponse self = new GetUserAppEnhanceProcessInMsaResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAppEnhanceProcessInMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAppEnhanceProcessInMsaResponse setBody(GetUserAppEnhanceProcessInMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAppEnhanceProcessInMsaResponseBody getBody() {
        return this.body;
    }

}
