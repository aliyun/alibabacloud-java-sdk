// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteForwardingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteForwardingRulesResponseBody body;

    public static DeleteForwardingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardingRulesResponse self = new DeleteForwardingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteForwardingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteForwardingRulesResponse setBody(DeleteForwardingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteForwardingRulesResponseBody getBody() {
        return this.body;
    }

}
