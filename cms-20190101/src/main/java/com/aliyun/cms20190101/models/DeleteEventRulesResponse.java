// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventRulesResponseBody body;

    public static DeleteEventRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRulesResponse self = new DeleteEventRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventRulesResponse setBody(DeleteEventRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventRulesResponseBody getBody() {
        return this.body;
    }

}
