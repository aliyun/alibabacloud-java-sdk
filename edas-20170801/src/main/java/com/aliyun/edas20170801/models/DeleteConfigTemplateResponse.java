// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteConfigTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConfigTemplateResponseBody body;

    public static DeleteConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigTemplateResponse self = new DeleteConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigTemplateResponse setBody(DeleteConfigTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigTemplateResponseBody getBody() {
        return this.body;
    }

}
