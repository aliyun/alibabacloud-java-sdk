// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetVerifyResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVerifyResultResponseBody body;

    public static GetVerifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVerifyResultResponse self = new GetVerifyResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVerifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVerifyResultResponse setBody(GetVerifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVerifyResultResponseBody getBody() {
        return this.body;
    }

}
