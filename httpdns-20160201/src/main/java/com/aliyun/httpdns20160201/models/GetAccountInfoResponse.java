// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccountInfoResponseBody body;

    public static GetAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountInfoResponse self = new GetAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountInfoResponse setBody(GetAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountInfoResponseBody getBody() {
        return this.body;
    }

}
