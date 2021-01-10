// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyBoardTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyBoardTokenResponseBody body;

    public static ApplyBoardTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyBoardTokenResponse self = new ApplyBoardTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyBoardTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyBoardTokenResponse setBody(ApplyBoardTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyBoardTokenResponseBody getBody() {
        return this.body;
    }

}
