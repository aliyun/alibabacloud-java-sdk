// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmsTemplateResponseBody body;

    public static UpdateSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsTemplateResponse self = new UpdateSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmsTemplateResponse setBody(UpdateSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
