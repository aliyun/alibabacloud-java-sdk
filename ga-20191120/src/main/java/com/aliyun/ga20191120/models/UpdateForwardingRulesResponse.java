// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateForwardingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateForwardingRulesResponseBody body;

    public static UpdateForwardingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateForwardingRulesResponse self = new UpdateForwardingRulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateForwardingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateForwardingRulesResponse setBody(UpdateForwardingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateForwardingRulesResponseBody getBody() {
        return this.body;
    }

}
