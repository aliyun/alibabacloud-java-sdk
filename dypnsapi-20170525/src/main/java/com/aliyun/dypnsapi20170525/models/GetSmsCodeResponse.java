// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSmsCodeResponseBody body;

    public static GetSmsCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsCodeResponse self = new GetSmsCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsCodeResponse setBody(GetSmsCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsCodeResponseBody getBody() {
        return this.body;
    }

}
