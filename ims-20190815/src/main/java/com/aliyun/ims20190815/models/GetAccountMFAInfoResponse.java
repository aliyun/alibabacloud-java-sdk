// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountMFAInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountMFAInfoResponseBody body;

    public static GetAccountMFAInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMFAInfoResponse self = new GetAccountMFAInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountMFAInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountMFAInfoResponse setBody(GetAccountMFAInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountMFAInfoResponseBody getBody() {
        return this.body;
    }

}
