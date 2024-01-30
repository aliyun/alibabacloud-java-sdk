// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeResourceGroupResponseBody body;

    public static AuthorizeResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceGroupResponse self = new AuthorizeResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeResourceGroupResponse setBody(AuthorizeResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeResourceGroupResponseBody getBody() {
        return this.body;
    }

}
