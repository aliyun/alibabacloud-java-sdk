// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class FlushLayer4RulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FlushLayer4RulesResponseBody body;

    public static FlushLayer4RulesResponse build(java.util.Map<String, ?> map) throws Exception {
        FlushLayer4RulesResponse self = new FlushLayer4RulesResponse();
        return TeaModel.build(map, self);
    }

    public FlushLayer4RulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlushLayer4RulesResponse setBody(FlushLayer4RulesResponseBody body) {
        this.body = body;
        return this;
    }
    public FlushLayer4RulesResponseBody getBody() {
        return this.body;
    }

}
