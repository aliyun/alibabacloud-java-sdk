// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateTemplateAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTemplateAppResponseBody body;

    public static CreateTemplateAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateAppResponse self = new CreateTemplateAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateTemplateAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTemplateAppResponse setBody(CreateTemplateAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTemplateAppResponseBody getBody() {
        return this.body;
    }

}
