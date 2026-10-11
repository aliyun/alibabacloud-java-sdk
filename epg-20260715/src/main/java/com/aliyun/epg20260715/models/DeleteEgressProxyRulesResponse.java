// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEgressProxyRulesResponseBody body;

    public static DeleteEgressProxyRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyRulesResponse self = new DeleteEgressProxyRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEgressProxyRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEgressProxyRulesResponse setBody(DeleteEgressProxyRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEgressProxyRulesResponseBody getBody() {
        return this.body;
    }

}
