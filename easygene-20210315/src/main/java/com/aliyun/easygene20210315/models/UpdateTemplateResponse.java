// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTemplateResponseBody body;

    public static UpdateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponse self = new UpdateTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTemplateResponse setBody(UpdateTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTemplateResponseBody getBody() {
        return this.body;
    }

}
