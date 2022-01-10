// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProjectMemberResponseBody body;

    public static UpdateProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectMemberResponse self = new UpdateProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectMemberResponse setBody(UpdateProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectMemberResponseBody getBody() {
        return this.body;
    }

}
