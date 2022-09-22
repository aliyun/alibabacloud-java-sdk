// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
