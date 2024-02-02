// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageCapacityUnitAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStorageCapacityUnitAttributeResponseBody body;

    public static ModifyStorageCapacityUnitAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageCapacityUnitAttributeResponse self = new ModifyStorageCapacityUnitAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageCapacityUnitAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStorageCapacityUnitAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStorageCapacityUnitAttributeResponse setBody(ModifyStorageCapacityUnitAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStorageCapacityUnitAttributeResponseBody getBody() {
        return this.body;
    }

}
