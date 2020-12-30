// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteVerifySchemeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVerifySchemeResponseBody body;

    public static DeleteVerifySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVerifySchemeResponse self = new DeleteVerifySchemeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVerifySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVerifySchemeResponse setBody(DeleteVerifySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVerifySchemeResponseBody getBody() {
        return this.body;
    }

}
