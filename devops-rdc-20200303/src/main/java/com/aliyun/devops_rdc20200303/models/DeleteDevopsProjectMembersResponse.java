// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDevopsProjectMembersResponseBody body;

    public static DeleteDevopsProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsProjectMembersResponse self = new DeleteDevopsProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevopsProjectMembersResponse setBody(DeleteDevopsProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevopsProjectMembersResponseBody getBody() {
        return this.body;
    }

}
