// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDedicatedBlockStorageClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDedicatedBlockStorageClusterAttributeResponseBody body;

    public static ModifyDedicatedBlockStorageClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedBlockStorageClusterAttributeResponse self = new ModifyDedicatedBlockStorageClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedBlockStorageClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedBlockStorageClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDedicatedBlockStorageClusterAttributeResponse setBody(ModifyDedicatedBlockStorageClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedBlockStorageClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
