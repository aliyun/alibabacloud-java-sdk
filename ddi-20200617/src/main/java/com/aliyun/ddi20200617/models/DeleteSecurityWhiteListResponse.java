// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteSecurityWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSecurityWhiteListResponseBody body;

    public static DeleteSecurityWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityWhiteListResponse self = new DeleteSecurityWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityWhiteListResponse setBody(DeleteSecurityWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityWhiteListResponseBody getBody() {
        return this.body;
    }

}
