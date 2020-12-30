// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetMobileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMobileResponseBody body;

    public static GetMobileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMobileResponse self = new GetMobileResponse();
        return TeaModel.build(map, self);
    }

    public GetMobileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMobileResponse setBody(GetMobileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMobileResponseBody getBody() {
        return this.body;
    }

}
