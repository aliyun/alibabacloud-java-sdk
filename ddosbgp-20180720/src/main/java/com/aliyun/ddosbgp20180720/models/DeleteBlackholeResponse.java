// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteBlackholeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBlackholeResponseBody body;

    public static DeleteBlackholeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackholeResponse self = new DeleteBlackholeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlackholeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBlackholeResponse setBody(DeleteBlackholeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBlackholeResponseBody getBody() {
        return this.body;
    }

}
