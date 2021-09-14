// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateScreenByTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScreenByTemplateResponseBody body;

    public static CreateScreenByTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenByTemplateResponse self = new CreateScreenByTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateScreenByTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScreenByTemplateResponse setBody(CreateScreenByTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScreenByTemplateResponseBody getBody() {
        return this.body;
    }

}
