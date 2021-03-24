// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateGroupMembersRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupMembersRoleResponseBody body;

    public static UpdateGroupMembersRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupMembersRoleResponse self = new UpdateGroupMembersRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupMembersRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupMembersRoleResponse setBody(UpdateGroupMembersRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupMembersRoleResponseBody getBody() {
        return this.body;
    }

}
