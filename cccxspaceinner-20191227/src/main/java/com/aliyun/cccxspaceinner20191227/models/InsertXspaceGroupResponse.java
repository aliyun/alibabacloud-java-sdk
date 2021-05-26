// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class InsertXspaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertXspaceGroupResponseBody body;

    public static InsertXspaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertXspaceGroupResponse self = new InsertXspaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public InsertXspaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertXspaceGroupResponse setBody(InsertXspaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertXspaceGroupResponseBody getBody() {
        return this.body;
    }

}
