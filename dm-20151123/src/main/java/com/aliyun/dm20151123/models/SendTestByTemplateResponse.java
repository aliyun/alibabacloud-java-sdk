// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SendTestByTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendTestByTemplateResponseBody body;

    public static SendTestByTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTestByTemplateResponse self = new SendTestByTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SendTestByTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTestByTemplateResponse setBody(SendTestByTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTestByTemplateResponseBody getBody() {
        return this.body;
    }

}
