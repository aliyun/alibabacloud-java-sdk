// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRoleResponseBody body;

    public static UpdateRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleResponse self = new UpdateRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRoleResponse setBody(UpdateRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRoleResponseBody getBody() {
        return this.body;
    }

}
