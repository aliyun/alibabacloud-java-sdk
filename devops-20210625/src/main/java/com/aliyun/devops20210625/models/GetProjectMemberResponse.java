// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectMemberResponseBody body;

    public static GetProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMemberResponse self = new GetProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectMemberResponse setBody(GetProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectMemberResponseBody getBody() {
        return this.body;
    }

}
