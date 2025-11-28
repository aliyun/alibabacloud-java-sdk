// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AuthorizeDeviceGroupBizChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeDeviceGroupBizChainResponseBody body;

    public static AuthorizeDeviceGroupBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeDeviceGroupBizChainResponse self = new AuthorizeDeviceGroupBizChainResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeDeviceGroupBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeDeviceGroupBizChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeDeviceGroupBizChainResponse setBody(AuthorizeDeviceGroupBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeDeviceGroupBizChainResponseBody getBody() {
        return this.body;
    }

}
