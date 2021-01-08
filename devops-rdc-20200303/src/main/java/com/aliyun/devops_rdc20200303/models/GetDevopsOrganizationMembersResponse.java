// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsOrganizationMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevopsOrganizationMembersResponseBody body;

    public static GetDevopsOrganizationMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsOrganizationMembersResponse self = new GetDevopsOrganizationMembersResponse();
        return TeaModel.build(map, self);
    }

    public GetDevopsOrganizationMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevopsOrganizationMembersResponse setBody(GetDevopsOrganizationMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevopsOrganizationMembersResponseBody getBody() {
        return this.body;
    }

}
