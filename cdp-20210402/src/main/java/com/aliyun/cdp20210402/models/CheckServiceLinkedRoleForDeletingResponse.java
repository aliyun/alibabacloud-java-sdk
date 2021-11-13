// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckServiceLinkedRoleForDeletingResponseBody body;

    public static CheckServiceLinkedRoleForDeletingResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingResponse self = new CheckServiceLinkedRoleForDeletingResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForDeletingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceLinkedRoleForDeletingResponse setBody(CheckServiceLinkedRoleForDeletingResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceLinkedRoleForDeletingResponseBody getBody() {
        return this.body;
    }

}
