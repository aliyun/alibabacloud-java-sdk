// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsOrganizationMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDevopsOrganizationMembersResponseBody body;

    public static DeleteDevopsOrganizationMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsOrganizationMembersResponse self = new DeleteDevopsOrganizationMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsOrganizationMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevopsOrganizationMembersResponse setBody(DeleteDevopsOrganizationMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevopsOrganizationMembersResponseBody getBody() {
        return this.body;
    }

}
