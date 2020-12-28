// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetHitCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHitCountResponseBody body;

    public static GetHitCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHitCountResponse self = new GetHitCountResponse();
        return TeaModel.build(map, self);
    }

    public GetHitCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHitCountResponse setBody(GetHitCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHitCountResponseBody getBody() {
        return this.body;
    }

}
