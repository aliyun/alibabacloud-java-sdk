// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCallInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallInfoResponseBody body;

    public static GetCallInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallInfoResponse self = new GetCallInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCallInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallInfoResponse setBody(GetCallInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallInfoResponseBody getBody() {
        return this.body;
    }

}
