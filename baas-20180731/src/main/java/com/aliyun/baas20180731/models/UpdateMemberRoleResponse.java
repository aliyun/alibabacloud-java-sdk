// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateMemberRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMemberRoleResponseBody body;

    public static UpdateMemberRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberRoleResponse self = new UpdateMemberRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemberRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemberRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemberRoleResponse setBody(UpdateMemberRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemberRoleResponseBody getBody() {
        return this.body;
    }

}
