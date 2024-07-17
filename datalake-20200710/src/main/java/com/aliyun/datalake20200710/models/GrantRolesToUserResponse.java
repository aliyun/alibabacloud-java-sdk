// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantRolesToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantRolesToUserResponseBody body;

    public static GrantRolesToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantRolesToUserResponse self = new GrantRolesToUserResponse();
        return TeaModel.build(map, self);
    }

    public GrantRolesToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantRolesToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantRolesToUserResponse setBody(GrantRolesToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantRolesToUserResponseBody getBody() {
        return this.body;
    }

}
