// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCorpThreeKeysVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCorpThreeKeysVerificationResponseBody body;

    public static GetCorpThreeKeysVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCorpThreeKeysVerificationResponse self = new GetCorpThreeKeysVerificationResponse();
        return TeaModel.build(map, self);
    }

    public GetCorpThreeKeysVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCorpThreeKeysVerificationResponse setBody(GetCorpThreeKeysVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCorpThreeKeysVerificationResponseBody getBody() {
        return this.body;
    }

}
