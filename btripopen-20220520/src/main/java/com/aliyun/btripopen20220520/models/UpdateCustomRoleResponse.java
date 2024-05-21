// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateCustomRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomRoleResponseBody body;

    public static UpdateCustomRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoleResponse self = new UpdateCustomRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomRoleResponse setBody(UpdateCustomRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomRoleResponseBody getBody() {
        return this.body;
    }

}
