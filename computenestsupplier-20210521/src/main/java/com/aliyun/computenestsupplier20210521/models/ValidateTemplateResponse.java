// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ValidateTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateTemplateResponseBody body;

    public static ValidateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateResponse self = new ValidateTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateTemplateResponse setBody(ValidateTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateTemplateResponseBody getBody() {
        return this.body;
    }

}
