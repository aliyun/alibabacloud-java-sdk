// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Role body;

    public static GetRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponse self = new GetRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoleResponse setBody(Role body) {
        this.body = body;
        return this;
    }
    public Role getBody() {
        return this.body;
    }

}
