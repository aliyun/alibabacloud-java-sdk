// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRulesResponseBody body;

    public static DeleteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRulesResponse self = new DeleteRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRulesResponse setBody(DeleteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRulesResponseBody getBody() {
        return this.body;
    }

}
