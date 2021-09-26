// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProjectMemberResponseBody body;

    public static CreateProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberResponse self = new CreateProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectMemberResponse setBody(CreateProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectMemberResponseBody getBody() {
        return this.body;
    }

}
