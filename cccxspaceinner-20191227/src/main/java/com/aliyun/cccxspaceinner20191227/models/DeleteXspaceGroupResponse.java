// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class DeleteXspaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteXspaceGroupResponseBody body;

    public static DeleteXspaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteXspaceGroupResponse self = new DeleteXspaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteXspaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteXspaceGroupResponse setBody(DeleteXspaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteXspaceGroupResponseBody getBody() {
        return this.body;
    }

}
