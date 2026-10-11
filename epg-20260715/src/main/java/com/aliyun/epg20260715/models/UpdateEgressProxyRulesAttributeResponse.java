// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyRulesAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEgressProxyRulesAttributeResponseBody body;

    public static UpdateEgressProxyRulesAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyRulesAttributeResponse self = new UpdateEgressProxyRulesAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyRulesAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEgressProxyRulesAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEgressProxyRulesAttributeResponse setBody(UpdateEgressProxyRulesAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEgressProxyRulesAttributeResponseBody getBody() {
        return this.body;
    }

}
