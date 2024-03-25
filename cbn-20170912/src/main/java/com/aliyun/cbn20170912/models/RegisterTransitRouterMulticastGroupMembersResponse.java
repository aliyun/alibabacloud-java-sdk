// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterTransitRouterMulticastGroupMembersResponseBody body;

    public static RegisterTransitRouterMulticastGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterTransitRouterMulticastGroupMembersResponse self = new RegisterTransitRouterMulticastGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public RegisterTransitRouterMulticastGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterTransitRouterMulticastGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterTransitRouterMulticastGroupMembersResponse setBody(RegisterTransitRouterMulticastGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterTransitRouterMulticastGroupMembersResponseBody getBody() {
        return this.body;
    }

}
