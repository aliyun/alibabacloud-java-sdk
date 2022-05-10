// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProjectMemberResponseBody body;

    public static DeleteProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectMemberResponse self = new DeleteProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProjectMemberResponse setBody(DeleteProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectMemberResponseBody getBody() {
        return this.body;
    }

}
