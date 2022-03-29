// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetAccountIdentityInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountIdentityInfoResponseBody body;

    public static GetAccountIdentityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountIdentityInfoResponse self = new GetAccountIdentityInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountIdentityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountIdentityInfoResponse setBody(GetAccountIdentityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountIdentityInfoResponseBody getBody() {
        return this.body;
    }

}
