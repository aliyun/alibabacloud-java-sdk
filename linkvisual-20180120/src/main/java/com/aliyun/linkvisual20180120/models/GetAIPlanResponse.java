// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAIPlanResponseBody body;

    public static GetAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIPlanResponse self = new GetAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetAIPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIPlanResponse setBody(GetAIPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIPlanResponseBody getBody() {
        return this.body;
    }

}
