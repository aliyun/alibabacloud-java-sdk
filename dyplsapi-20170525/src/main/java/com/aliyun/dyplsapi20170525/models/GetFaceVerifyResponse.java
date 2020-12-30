// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFaceVerifyResponseBody body;

    public static GetFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceVerifyResponse self = new GetFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFaceVerifyResponse setBody(GetFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
