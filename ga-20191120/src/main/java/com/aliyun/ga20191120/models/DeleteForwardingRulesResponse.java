// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteForwardingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteForwardingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteForwardingRulesResponse setBody(DeleteForwardingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteForwardingRulesResponseBody getBody() {
        return this.body;
    }

}
