// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class EditXspaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditXspaceGroupResponseBody body;

    public static EditXspaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        EditXspaceGroupResponse self = new EditXspaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public EditXspaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditXspaceGroupResponse setBody(EditXspaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public EditXspaceGroupResponseBody getBody() {
        return this.body;
    }

}
