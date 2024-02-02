// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDedicatedHostClusterAttributeResponseBody body;

    public static ModifyDedicatedHostClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostClusterAttributeResponse self = new ModifyDedicatedHostClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDedicatedHostClusterAttributeResponse setBody(ModifyDedicatedHostClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
