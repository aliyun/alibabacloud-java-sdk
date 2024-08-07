// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeInstanceGroupResponseBody body;

    public static AuthorizeInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeInstanceGroupResponse self = new AuthorizeInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeInstanceGroupResponse setBody(AuthorizeInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
