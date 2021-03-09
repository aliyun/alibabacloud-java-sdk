// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateThirdSsoAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateThirdSsoAgentResponseBody body;

    public static CreateThirdSsoAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateThirdSsoAgentResponse self = new CreateThirdSsoAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateThirdSsoAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateThirdSsoAgentResponse setBody(CreateThirdSsoAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateThirdSsoAgentResponseBody getBody() {
        return this.body;
    }

}
