// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyNetworkRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNetworkRuleAttributeResponseBody body;

    public static ModifyNetworkRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkRuleAttributeResponse self = new ModifyNetworkRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkRuleAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNetworkRuleAttributeResponse setBody(ModifyNetworkRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
