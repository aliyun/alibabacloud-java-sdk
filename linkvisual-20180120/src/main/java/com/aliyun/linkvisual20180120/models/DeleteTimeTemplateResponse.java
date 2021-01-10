// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteTimeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTimeTemplateResponseBody body;

    public static DeleteTimeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTimeTemplateResponse self = new DeleteTimeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTimeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTimeTemplateResponse setBody(DeleteTimeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTimeTemplateResponseBody getBody() {
        return this.body;
    }

}
