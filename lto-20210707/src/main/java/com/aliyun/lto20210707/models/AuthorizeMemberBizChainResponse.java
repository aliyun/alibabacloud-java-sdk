// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AuthorizeMemberBizChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeMemberBizChainResponseBody body;

    public static AuthorizeMemberBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeMemberBizChainResponse self = new AuthorizeMemberBizChainResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeMemberBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeMemberBizChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeMemberBizChainResponse setBody(AuthorizeMemberBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeMemberBizChainResponseBody getBody() {
        return this.body;
    }

}
