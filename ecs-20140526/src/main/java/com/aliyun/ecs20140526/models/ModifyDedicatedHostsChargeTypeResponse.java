// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostsChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostsChargeTypeResponseBody body;

    public static ModifyDedicatedHostsChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostsChargeTypeResponse self = new ModifyDedicatedHostsChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostsChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostsChargeTypeResponse setBody(ModifyDedicatedHostsChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostsChargeTypeResponseBody getBody() {
        return this.body;
    }

}
