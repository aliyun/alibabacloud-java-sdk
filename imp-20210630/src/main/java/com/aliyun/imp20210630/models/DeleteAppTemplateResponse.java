// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteAppTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppTemplateResponseBody body;

    public static DeleteAppTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppTemplateResponse self = new DeleteAppTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppTemplateResponse setBody(DeleteAppTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppTemplateResponseBody getBody() {
        return this.body;
    }

}
