// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoReleaseTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDedicatedHostAutoReleaseTimeResponseBody body;

    public static ModifyDedicatedHostAutoReleaseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoReleaseTimeResponse self = new ModifyDedicatedHostAutoReleaseTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse setBody(ModifyDedicatedHostAutoReleaseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostAutoReleaseTimeResponseBody getBody() {
        return this.body;
    }

}
