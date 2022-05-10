// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppTemplateResponseBody body;

    public static UpdateAppTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateResponse self = new UpdateAppTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppTemplateResponse setBody(UpdateAppTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppTemplateResponseBody getBody() {
        return this.body;
    }

}
