// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostsChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDedicatedHostsChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDedicatedHostsChargeTypeResponse setBody(ModifyDedicatedHostsChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostsChargeTypeResponseBody getBody() {
        return this.body;
    }

}
