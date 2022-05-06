// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteAccessGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccessGroupResponseBody body;

    public static DeleteAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessGroupResponse self = new DeleteAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessGroupResponse setBody(DeleteAccessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessGroupResponseBody getBody() {
        return this.body;
    }

}
