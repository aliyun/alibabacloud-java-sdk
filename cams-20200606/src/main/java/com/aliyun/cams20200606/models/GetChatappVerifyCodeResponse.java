// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatappVerifyCodeResponseBody body;

    public static GetChatappVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatappVerifyCodeResponse self = new GetChatappVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetChatappVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatappVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatappVerifyCodeResponse setBody(GetChatappVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappVerifyCodeResponseBody getBody() {
        return this.body;
    }

}
