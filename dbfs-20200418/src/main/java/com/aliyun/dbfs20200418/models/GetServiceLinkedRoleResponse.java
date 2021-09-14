// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceLinkedRoleResponseBody body;

    public static GetServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleResponse self = new GetServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceLinkedRoleResponse setBody(GetServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
