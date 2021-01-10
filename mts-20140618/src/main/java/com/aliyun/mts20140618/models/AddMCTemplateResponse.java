// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMCTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMCTemplateResponseBody body;

    public static AddMCTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMCTemplateResponse self = new AddMCTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddMCTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMCTemplateResponse setBody(AddMCTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMCTemplateResponseBody getBody() {
        return this.body;
    }

}
