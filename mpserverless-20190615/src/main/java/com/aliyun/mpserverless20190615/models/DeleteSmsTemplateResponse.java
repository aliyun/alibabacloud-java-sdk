// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSmsTemplateResponseBody body;

    public static DeleteSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateResponse self = new DeleteSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmsTemplateResponse setBody(DeleteSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
