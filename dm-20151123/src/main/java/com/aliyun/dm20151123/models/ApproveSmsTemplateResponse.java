// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveSmsTemplateResponseBody body;

    public static ApproveSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveSmsTemplateResponse self = new ApproveSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ApproveSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveSmsTemplateResponse setBody(ApproveSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
