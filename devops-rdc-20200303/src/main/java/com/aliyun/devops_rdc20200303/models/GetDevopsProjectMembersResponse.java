// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevopsProjectMembersResponseBody body;

    public static GetDevopsProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectMembersResponse self = new GetDevopsProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevopsProjectMembersResponse setBody(GetDevopsProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevopsProjectMembersResponseBody getBody() {
        return this.body;
    }

}
