// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMembersResponseBody body;

    public static DeleteMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMembersResponse self = new DeleteMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMembersResponse setBody(DeleteMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMembersResponseBody getBody() {
        return this.body;
    }

}
