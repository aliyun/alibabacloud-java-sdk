// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlertRulesResponseBody body;

    public static DeleteAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRulesResponse self = new DeleteAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertRulesResponse setBody(DeleteAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertRulesResponseBody getBody() {
        return this.body;
    }

}
