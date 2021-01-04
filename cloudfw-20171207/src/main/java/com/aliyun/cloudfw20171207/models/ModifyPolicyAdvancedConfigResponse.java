// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPolicyAdvancedConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPolicyAdvancedConfigResponseBody body;

    public static ModifyPolicyAdvancedConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyAdvancedConfigResponse self = new ModifyPolicyAdvancedConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyAdvancedConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolicyAdvancedConfigResponse setBody(ModifyPolicyAdvancedConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolicyAdvancedConfigResponseBody getBody() {
        return this.body;
    }

}
