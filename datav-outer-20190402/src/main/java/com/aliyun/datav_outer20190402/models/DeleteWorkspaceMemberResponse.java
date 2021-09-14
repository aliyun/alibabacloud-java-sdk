// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DeleteWorkspaceMemberResponse setBody(DeleteWorkspaceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceMemberResponseBody getBody() {
        return this.body;
    }

}
