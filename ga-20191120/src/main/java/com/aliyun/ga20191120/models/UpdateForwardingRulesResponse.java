// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateForwardingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateForwardingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateForwardingRulesResponse setBody(UpdateForwardingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateForwardingRulesResponseBody getBody() {
        return this.body;
    }

}
