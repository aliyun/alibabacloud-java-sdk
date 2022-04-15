// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RegisterTransitRouterMulticastGroupMembersResponse setBody(RegisterTransitRouterMulticastGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterTransitRouterMulticastGroupMembersResponseBody getBody() {
        return this.body;
    }

}
