// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyNetworkRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyNetworkRuleAttributeResponse setBody(ModifyNetworkRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
