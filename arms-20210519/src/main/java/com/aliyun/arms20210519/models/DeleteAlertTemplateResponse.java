// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DeleteAlertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlertTemplateResponseBody body;

    public static DeleteAlertTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertTemplateResponse self = new DeleteAlertTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertTemplateResponse setBody(DeleteAlertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertTemplateResponseBody getBody() {
        return this.body;
    }

}
