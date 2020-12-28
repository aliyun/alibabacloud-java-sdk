// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateJobTemplateResponseBody body;

    public static CreateJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateResponse self = new CreateJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobTemplateResponse setBody(CreateJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobTemplateResponseBody getBody() {
        return this.body;
    }

}
