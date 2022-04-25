// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRoleUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRoleUsersResponseBody body;

    public static UpdateRoleUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleUsersResponse self = new UpdateRoleUsersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRoleUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRoleUsersResponse setBody(UpdateRoleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRoleUsersResponseBody getBody() {
        return this.body;
    }

}
