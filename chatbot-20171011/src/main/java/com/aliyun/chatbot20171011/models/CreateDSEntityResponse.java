// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateDSEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDSEntityResponseBody body;

    public static CreateDSEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityResponse self = new CreateDSEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDSEntityResponse setBody(CreateDSEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDSEntityResponseBody getBody() {
        return this.body;
    }

}
