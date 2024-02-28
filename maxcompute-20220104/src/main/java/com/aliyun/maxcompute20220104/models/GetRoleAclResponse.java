// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRoleAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoleAclResponseBody body;

    public static GetRoleAclResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleAclResponse self = new GetRoleAclResponse();
        return TeaModel.build(map, self);
    }

    public GetRoleAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoleAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoleAclResponse setBody(GetRoleAclResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoleAclResponseBody getBody() {
        return this.body;
    }

}
