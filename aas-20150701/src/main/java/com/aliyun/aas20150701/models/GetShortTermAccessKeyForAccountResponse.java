// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetShortTermAccessKeyForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetShortTermAccessKeyForAccountResponseBody body;

    public static GetShortTermAccessKeyForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShortTermAccessKeyForAccountResponse self = new GetShortTermAccessKeyForAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetShortTermAccessKeyForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShortTermAccessKeyForAccountResponse setBody(GetShortTermAccessKeyForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShortTermAccessKeyForAccountResponseBody getBody() {
        return this.body;
    }

}
