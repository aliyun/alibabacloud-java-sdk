// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateLayer4RulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLayer4RulesResponseBody body;

    public static CreateLayer4RulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RulesResponse self = new CreateLayer4RulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLayer4RulesResponse setBody(CreateLayer4RulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLayer4RulesResponseBody getBody() {
        return this.body;
    }

}
