// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWorkspaceMemberResponseBody body;

    public static DeleteWorkspaceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMemberResponse self = new DeleteWorkspaceMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceMemberResponse setBody(DeleteWorkspaceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceMemberResponseBody getBody() {
        return this.body;
    }

}
