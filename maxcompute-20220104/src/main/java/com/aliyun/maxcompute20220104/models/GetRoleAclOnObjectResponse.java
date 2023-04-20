// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRoleAclOnObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoleAclOnObjectResponseBody body;

    public static GetRoleAclOnObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleAclOnObjectResponse self = new GetRoleAclOnObjectResponse();
        return TeaModel.build(map, self);
    }

    public GetRoleAclOnObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoleAclOnObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoleAclOnObjectResponse setBody(GetRoleAclOnObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoleAclOnObjectResponseBody getBody() {
        return this.body;
    }

}
