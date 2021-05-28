// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DisableAlertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableAlertTemplateResponseBody body;

    public static DisableAlertTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAlertTemplateResponse self = new DisableAlertTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DisableAlertTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAlertTemplateResponse setBody(DisableAlertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAlertTemplateResponseBody getBody() {
        return this.body;
    }

}
