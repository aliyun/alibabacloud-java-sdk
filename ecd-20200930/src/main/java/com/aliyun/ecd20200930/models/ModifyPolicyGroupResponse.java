// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPolicyGroupResponseBody body;

    public static ModifyPolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupResponse self = new ModifyPolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolicyGroupResponse setBody(ModifyPolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolicyGroupResponseBody getBody() {
        return this.body;
    }

}
