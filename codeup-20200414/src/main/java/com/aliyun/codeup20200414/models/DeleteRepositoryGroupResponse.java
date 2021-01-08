// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepositoryGroupResponseBody body;

    public static DeleteRepositoryGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryGroupResponse self = new DeleteRepositoryGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryGroupResponse setBody(DeleteRepositoryGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryGroupResponseBody getBody() {
        return this.body;
    }

}
